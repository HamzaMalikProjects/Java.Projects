/**
 *
 * @author Hamza Malik
 */

//specifies the package in which the Counter class is located.
package coe318.lab2;

//counter class
public class Counter {
    
    //Instance variables here
    /**
    * declare the instance variables of the Counter class. 
    * The variables modulus and digit are integers, 
    * while left is a reference to another Counter object.
    */
    int modulus, digit;
    Counter left;
        
    /*
    This is the constructor of the Counter class. 
    It takes two parameters: modulus and left. 
    The constructor initializes the instance variables modulus 
    and left with the values passed as arguments.
    It also sets the digit variable to 0.
    */
    public Counter(int modulus, Counter left) {
        this.modulus = modulus;
        this.left = left;
        digit = 0;
    }

    /**
     * getter method that returns the modulus
     */
    public int getModulus() {
        return this.modulus;
    }

    /**
     *Getter method that Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return this.left;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit = getDigit();
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
            digit++;
        if(digit == modulus){
            digit = 0;
            if(this.left != null){
                this.left.digit++;
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    
    /**This method calculates and returns the total count of the current Counter 
     * combined with any Counter objects to its left. 
     * If the left counter exists, it multiplies the modulus of the left counter
     * by its digit and adds it to the current digit. If there is no left counter, 
     * it simply returns the current digit.
     * This method increments the digit variable by 1.
     * If the digit becomes equal to the modulus value, 
     * it resets the digit to 0. Additionally,
     * if the left counter exists (not null), 
     * it increments the digit of the left counter as well.

     **/ 
    public int getCount() {
        if(this.left != null){
            return(digit + modulus*left.digit);
        }else {
            return(digit);
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     
     * Override is basically superclass, we getcounter() and sub it back into the main class
     */
    /*
    This is an overridden toString() method.
    It returns a string representation of the Counter
    object by calling the getCount() method and converting 
    the result to a string.
    */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
        /** Getcounter() provides a total count of 
         * 
         **/
    }

}

/*
This is a for loop that executes four times.
In each iteration, it prints the value of
d0 using System.out.println(), and then calls the increment()
method on d0. The increment() method increases the value of
d0 by 1.

increments it
*/
