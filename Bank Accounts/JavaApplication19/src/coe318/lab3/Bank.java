/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab3;

/**
 * Created by Hamza Malik
 */


/*
This block of code defines the Bank class. It has three private instance variables:
name, accounts, and numAccounts.
name is a String that stores the name of the bank.
accounts is an array of Account objects that will hold the bank's accounts.
numAccounts is an integer that keeps track of the number of active accounts 
in the bank.
The Bank class also has a constructor that takes a name and maxNumberAccounts 
as parameters. It initializes the name variable with the provided name, 
creates a new Account array with a length equal to maxNumberAccounts, 
and sets numAccounts to 0.
*/
public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] accounts;
    private int numAccounts;//number of active accounts
    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }
    
    /**
     * These are getter methods that provide access to the private instance variables
     * of the Bank class. They allow other classes to retrieve the name, numAccounts,
     * and accounts of the bank.
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
        return this.numAccounts;
    }

    public Account[] getAccounts() {
        return this.accounts;
    }
    
    
    /**
     * This method checks if the bank already has an account with a given account
     * number. It iterates through the accounts array and checks each 
     * non-null account's number against the provided accountNumber. 
     * If a match is found, it returns true. If the end of the loop is reached
     * without finding a match, it returns false.

     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) {
        for(Account account : this.accounts) {
           if(account != null){
               if (account.getNumber() == accountNumber) {
                   return true;
               }
           }
        }
        return false;
    }
    
    
    
    /**
     * This method adds an Account object to the accounts array of the bank.
     * It first checks if the account number already exists in the bank by 
     * calling the hasAccountNumber method. If the account number already exists,
     * it returns false, indicating that the addition was unsuccessful. 
     * Otherwise, it iterates through the accounts array to find the first 
     * available (null) slot and adds the account object to that slot. 
     * It increments numAccounts and returns true to indicate a successful addition.
  
     * Adds the specified account to the Bank.
     * If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false; otherwise, true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        if(this.hasAccountNumber(account.getNumber())){
           return false;
        }else {
            for (int i = 0; i < this.accounts.length; i++) {
                if (this.accounts[i] == null) {
                    this.accounts[i] = account;
                    this.numAccounts++;
                    break;
                }
            }
            return true;
        }
    }

    
/*
 This toString() method generates a string representation of the Bank object.
 It first initializes a string s with the name of the bank, the number of 
    accounts currently open, and the maximum number of accounts allowed. 
    It uses the getter methods getName(), getNumAccounts(), and getAccounts().
    length to obtain the corresponding values.
    Next, it iterates through the accounts array using a for-each loop. 
    For each non-null account, it appends a string representation of the account
    to s with the format "\n " + account.toString(). 
    The loop terminates if it encounters a null account.
    Finally, it returns the generated string s, which contains information 
    about the bank's name, the number of open accounts, and the account details.
   
    The @Override annotation is used to indicate that a method in a subclass 
    overrides a method with the same signature in its superclass. 
    It provides compile-time checks to ensure the method is correctly overriding
    the superclass method.
    */    
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }

}
