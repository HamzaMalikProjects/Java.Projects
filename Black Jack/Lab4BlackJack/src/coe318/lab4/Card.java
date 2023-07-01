 package coe318.lab4;

 /**
 *
 * @author hamzamalik
 */
 
/**
 * The Card class represents a playing card in a standard deck.
 */
public class Card implements Comparable {
    //instance variables of the Card class.
    // ranks and assigns value to each of the cards
    //rank 14 represents the Ace, etc
    int rank, suit;
    
    // instance variable of the Card class
    //true indicates face up cards 
    //false just means face down
    boolean faceUp;

    // Symbolic constants for card suits
    //playing card in a standard deck.
    public static final int CLUB = 0;
    public static final int DIAMOND = 1;
    public static final int HEART = 2;
    public static final int SPADE = 3;

    /**
     * Construct a card of the given rank, suit, and faceUp status.
     *
     * @param rank   the rank of the card (2 to 14)
     * @param suit   the suit of the card (0 to 3)
     * @param faceUp the faceUp status of the card (true if face up, false if face down)
     */
    // initializes the corresponding instance variables.
    
    public Card(int rank, int suit, boolean faceUp) {
        this.rank = rank;
        this.suit = suit;
        this.faceUp = faceUp;
    }

    /**
     * @return the faceUp status of the card
     */
    public boolean isFaceUp() {
        return this.faceUp;
    }

    /**
     * Set the faceUp status of the card.
     *
     * @param faceUp the faceUp status to set
     */
    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }

    /**
     * @return the rank of the card
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * @return the suit of the card
     */
    public int getSuit() {
        return this.suit;
    }

    @Override
    public boolean equals(Object ob) {
        if (!(ob instanceof Card)) {
            return false;
        }
        Card c = (Card) ob;
        // Compare the rank and suit of the cards
        if (c.rank == this.rank && c.suit == this.suit) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        // Generate a unique hash code for the card based on rank and suit
        int hash = 7;
        hash = 31 * hash + this.getRank();
        hash = 31 * hash + this.getSuit();
        return hash;
    }

    @Override
    public int compareTo(Object obj) {
        // Call the overloaded compareTo method
        return compareTo((Card) obj);
    }

    public int compareTo(Card c) {
        // Compare cards based on rank first, then suit
        if (this.rank < c.rank) {
            return -1;
        } else if (this.rank > c.rank) {
            return 1;
        } else {
            if (this.suit > c.suit) {
                return 1;
            } else if (this.suit < c.suit) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    /**
     * Return the rank of the card as a String representation.
     *
     * @return the rank String
     */
    public String getRankString() {
        // Convert numeric ranks to corresponding names (e.g., 11 to "Jack")
        switch (this.rank) {
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 14:
                return "Ace";
            default:
                return Integer.toString(this.rank);
        }
    }

    /**
     * Return the suit of the card as a String representation.
     *
     * @return the suit String
     */
    public String getSuitString() {
        // Convert suit number to corresponding suit name
        String suit = "";
        switch (this.suit) {
            case CLUB:
                suit = "Clubs";
                break;
            case DIAMOND:
                suit = "Diamonds";
                break;
            case HEART:
                suit = "Hearts";
                break;
            case SPADE:
                suit = "Spades";
                break;
        }
        return suit;
    }

    /**
     * Get the value or score of the card.
     *
     * @return the value of the card
     */
    public int value() {
        // Determine the value of the card based on its rank
        if (this.rank == 14) {
            return 1;
        } else if (this.rank > 10) {
            return 10;
        } else {
            return this.rank;
        }
    }

    /**
     * Return a String representation of the card.
     * If the card is face up, return the rank and suit (e.g., "5 of Clubs").
     * If the card is face down, return "?".
     *
     * @return the String representation of the card
     */
    @Override
    public String toString() {
        if (this.faceUp) {
            return this.getRankString() + " of " + this.getSuitString();
        } else {
            return "?";
        }
    }

    public static void main(String[] args) {
        // Test the Card class with sample cards
        Card club5 = new Card(5, CLUB, true);
        System.out.println("club5: " + club5);

        Card spadeAce = new Card(14, SPADE, true);
        System.out.println("spadeAce: " + spadeAce);

        System.out.println("club5 compareTo spadeAce: " + club5.compareTo(spadeAce));
        System.out.println("club5 compareTo club5: " + club5.compareTo(club5));
        System.out.println("club5 equals spadeAce: " + club5.equals(spadeAce));
        System.out.println("club5 equals club5: " + club5.equals(club5));
    }
}
