//source package
package coe318.lab4;

/**
 * The BlackjackGame class represents a game of Blackjack.
 * If the total exceeds 21 points, it busts, and all bets 
 * on it immediately lose.
 * Main goal is to keep the score close to 21 as possible
 * without exceeding.
 * The game continues with new rounds until the players 
 * decide to stop
 */

/**
 *
 * @author hamzamalik
 */


//instance variables 
//declare private instance variables
//store the deck of cards, the cards in the house's hand, 
//the cards in the player's hand, and the game state information.
public class BlackjackGame {

    private CardPile deck;
    private CardPile houseCards;
    private CardPile yourCards;
    private boolean houseDone;
    private boolean playerDone;
    private UserInterface ui;

    
    //constructor of the BlackjackGame class
    //Initializes deck variable with a new instance of CardPile,
    public BlackjackGame(UserInterface ui) {
        this.ui = ui;
        ui.setGame(this);
        deck = new CardPile();
        // Create a deck of cards
        // Iterates over the card ranks from 2 to 14
        //Using Nested loops to populate deck of 52 cards
        for (int i = 2; i < 15; i++) { // Loop over card ranks (2 to Ace)
            for (int j = 0; j < 4; j++) { // Loop over card suits (0 to 3)
                deck.addCard(new Card(i, j, true)); // Create a card with the rank, suit, and faceUp status
            }
        }
        houseCards = new CardPile();
        yourCards = new CardPile();
        // Initialize each player as unfinished
        houseDone = false;
        playerDone = false;
    }

    //This method starts the game by distributing cards to the house and the player. 
    public void start() {
        Card c;
        c = deck.removeRandom();
        c.setFaceUp(false);
        getHouseCards().addCard(c); // Add a card to the houseCards pile (face down)
        getHouseCards().addCard(deck.removeRandom()); // Add a card to the houseCards pile (face up)
        getYourCards().addCard(deck.removeRandom()); // Add a card to the yourCards pile (face up)
        getYourCards().addCard(deck.removeRandom()); // Add a card to the yourCards pile (face up)
        ui.display(); // Display the initial state of the game
    }

    public void play() {
        while (!houseDone || !playerDone) { // Continue playing until both players are done
            if (!houseDone) {
                if (score(getHouseCards()) <= 17) { // If the score of houseCards is less than or equal to 17
                    getHouseCards().addCard(deck.removeRandom()); // Add a card to the houseCards pile
                    ui.display(); // Display the updated state of the game
                } else {
                    houseDone = true; // Set houseDone to true if the score is greater than 17
                }
            }
            if (!playerDone) {
                if (ui.hitMe()) { // Prompt the user to decide whether to hit or stay
                    getYourCards().addCard(deck.removeRandom()); // Add a card to the yourCards pile
                    ui.display(); // Display the updated state of the game
                } else {
                    playerDone = true; // Set playerDone to true if the user decides to stay
                }
            }
        }
    }

    public void end() {
        getHouseCards().getCards().get(0).setFaceUp(true); // Turn the first card of houseCards face up
        ui.gameOver(); // Notify the user that the game is over
    }

    /**
     * Determine the score of a pile of cards.
     *
     * @param the CardPile to calculate the score for
     * @return the score
     */
    public int score(CardPile p) {
        int scoreSum = 0;
        for (Card card : p.getCards()) {
            scoreSum += card.value(); // Add the value of each card to the total score
        }
        
        return scoreSum; // Return the total score
    }

    /**
     * @return houseCards pile
     */
    public CardPile getHouseCards() {
        return houseCards;
    }

    /**
     * @return yourCards Pile
     */
    public CardPile getYourCards() {
        return yourCards;
    }

    //main method
    //creates an instance of BlackjackGame called game
    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame(new SimpleUI());
        //Calls SimpleUI object as a parameter to the constructor
        // TO Start, Play, End the Game
        game.start();
        game.play();
        game.end();
    }
}
