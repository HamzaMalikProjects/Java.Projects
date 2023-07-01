/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author hamza malik
 */
public class Node {
    
    //Instance variables
    private int nodeId;
    private static int node_count = 0; 
    
    // Contructor
    public Node(){
       this.nodeId = node_count ;
       node_count++;
    }
    
    /* 
    Return the String representation of the node
    */
    @Override
    public String toString(){
        // return node id in string format
        return("" + this.nodeId);
    }
    
    } //end node class

