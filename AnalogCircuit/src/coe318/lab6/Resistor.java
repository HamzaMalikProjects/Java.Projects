/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;
/**
 *
 * @author Hamza Malik
 */
public class Resistor {
    
public double resistance;
    private Node node1;
    private Node node2;
    private int id;
    private static int counter =1; 
    
    public Resistor(double resistance, Node node1, Node node2)
    {
        if(resistance <= 0)
        {
            throw new IllegalArgumentException();
        }
        if (node1== null || node2==null)
        {
            throw new IllegalArgumentException();
        }
        this.resistance = resistance; // Resistance value in ohms
        this.node1 = node1;
        this.node2 = node2;
        this.id = counter;
        counter ++;  
    }
    
    public Node[] getNodes()
    {
       Node[] nodes = new Node[2];
       nodes[0] = this.node1;
       nodes[1] = this.node2;
       return nodes;
    }
    
    public String toString()
    {
        if (this.node1.id < this.node2.id)
            return "R" + this.id + " " + this.node1 + " " + this.node2 + " " + this.resistance;
        else
            return "R" + this.id + " " + this.node1 + " " + this.node2 + " " + this.resistance;
       
    }
    
}
