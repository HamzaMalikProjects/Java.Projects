/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab3;
/**
 * Created by Hamza Malik
 */
public class Account {

    /*
    (name, number, and balance) as private,
    meaning they can only be accessed within the Account class itself.
    */
    private String name;
    private int number;
    private double balance;

    
    /*
    constructor For Account Class
    It takes three parameters (name, number, and initialBalance) and 
    initializes the corresponding instance variables.
    */
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        balance = initialBalance;
        //Assigns values of the constructors to the 
        //respective instance variables within the Account object being created.
    }
 
    
    // method to get account name; retuns the value set for name
    // Instance variable, allowing access to the account holder's name.
    public String getName() {
        return this.name;
    }

    // method to get account number; retuns the value set for the account number
    //Instance variable, providing access to the account number.
    public int getNumber() {
        return this.number;
    }

    // method to get account balance; Returns value for account balance
    //Instance variable, allowing access to the account balance.
    public double getBalance() {
        return this.balance;
    }

    
    /*
    This method performs a deposit into the account.
    If the amount parameter is less than or equal to zero, 
    it returns false to indicate an unsuccessful deposit. 
    Otherwise, it adds the amount to the balance and returns true
    to indicate a successful deposit.
    */
    // deposit function that will also return a bool for success
    public boolean deposit(double amount){
        if(amount <=0) {
            return false;
        }else {
            this.balance += amount;
            return true;
        }
    }// end deposit

    
    
    /*
    This method performs a withdrawal from the account.
    It checks if the withdrawal amount is greater than zero 
    and if the resulting balance after the withdrawal remains non-negative. 
    If both conditions are met, it subtracts the amount from the balance 
    and returns true to indicate a successful withdrawal. 
    Otherwise, it returns false to indicate an unsuccessful withdrawal.
    */
    // withdraw function that will also return a bool for success
    public boolean withdraw(double amount){
        if((this.balance - amount) >= 0 && amount > 0){
            this.balance -= amount;
            return true;
        }else{
            return false;
        }
    }// end withdraw

    
    /*
    This method overrides the toString() method inherited from the Object class.
    It generates a string representation of the Account object, 
    including the account holder's name, account number, and balance.
    The balance is formatted as a currency value with two decimal places.
    */
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
    }
} // end class
  // end of the Account class definition.