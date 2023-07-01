/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Hamza Malik
 */
public class Node {
    
 public int id; // Id number of current node
    public static int id_next=0; // Id value of next node
    
    public Node()
    {
        this.id= id_next;
        id_next++;     
    }
    
    public String toString(){
        return " " + this.id;
    }
    
}

