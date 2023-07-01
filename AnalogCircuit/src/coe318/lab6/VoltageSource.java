/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Hamza alik
 */
public class VoltageSource {
    
    private double voltage;
    private Node node1;
    private Node node2;
    private int id;
    private static int counter =1;
    
    public VoltageSource (double voltage, Node node1, Node node2)
    {
        //If statement are used to check the polarity of the entered voltage source
        //if((node1.id > node2.id && voltage > 0) || (node1.id < node2.id && voltage <0))
        //{
           // Statements apply to a vsource that follows the sign convention and has a voltage value
            this.node1 = node1;
            this.node2 = node2;
            this.voltage = voltage;
            this.id = counter;
            counter ++; 
        /*}
        else
        {
            System.out.println("The polarity of the voltage source is incorrect");
            throw new IllegalArgumentException();               
        }*/
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
            return "V" + this.id + " " + this.node1 + " " + this.node2 + " DC  " + "-" + this.voltage +".";
        else
            return "V" + this.id + " " + this.node1 + " " + this.node2 + " DC  " + this.voltage +".";
    } 
    
}

