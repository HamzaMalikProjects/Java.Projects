/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author hamzamalik
 */
public class MainTest {
    
    public static void main(String[] args) {
        
        Circuit c1 = Circuit.getInstance();
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        Node D = new Node();
        
        System.out.println("Node" + A.toString());
        System.out.println("Node" + B.toString());
        System.out.println("Node" + C.toString());
        System.out.println("Node" + D.toString());

        Resistor r1 = new Resistor(30.0, A, B );
        Resistor r2 = new Resistor(100.0, B, C );
        Resistor r3 = new Resistor(60.0, C, A );
        Resistor r4 = new Resistor(200.0, C, A );
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        
        System.out.println("\nCircuit");

        
        c1.add(r1);
        c1.add(r2);
        c1.add(r3);
        c1.add(r4);
        System.out.println(c1.toString());
    }
    
}
