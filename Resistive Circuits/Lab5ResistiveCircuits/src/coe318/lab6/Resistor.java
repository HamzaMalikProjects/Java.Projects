/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author hamza malik
 */
public class Resistor {
    
    // Instance variables
    public double resistance;
    public Node node1, node2;
    public int resId;
    private static int res_count = 0;
    
    // Constructor
    public Resistor(double resistance, Node node1, Node node2){
        
        // Handle invalid input
        
        if(resistance < 0){
            throw new IllegalArgumentException("Resitances cannot be negative.");}
        
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("The connecting nodes must both exist. (Null Error)");}
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resId = res_count; // Assign unique ID
        res_count++; // Increment this unique ID 
    }
    
    /*
    Get nodes method, return an array of connected nodes
    */
    
    public Node[] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
    }
    
    /*
    toString method, returns the resistor in a string format
    */
    @Override
    public String toString(){
        return("R"+resId + " " + node1 + " " + node2 + " " + resistance);
    }
    
}// End Resistor Class
