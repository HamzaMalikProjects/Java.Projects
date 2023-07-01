/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Hamza Malik
 */
public class UserMain {
        String input = "";
    ArrayList<Object> cirElement = new ArrayList<>();
    Scanner userIn = new Scanner(System.in);
    
    public void start()
    {
        display();
        run();
    }
    
    public void run()
    {
        while(true){
            input = userIn.nextLine().trim();
            if(input.equalsIgnoreCase("end")) 
            {
                end();
                break;
            }
            
            else if(input.equalsIgnoreCase("spice"))
            {
                spice();
            }
            else
            {
                String[] value = input.split(" ");
                if(value.length != 4)
                {
                    System.out.println("Please review the format of your inputs");
                }
                else
                {
                    if(input.toLowerCase().startsWith("v"))
                    {
                        double temp;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.id = Integer.parseInt(value[1]);
                        n2.id = Integer.parseInt(value[2]);
                        temp = Double.parseDouble(value[3]);
                        VoltageSource v = new VoltageSource(temp, n1, n2);
                        cirElement.add(v);
                    }
                    else if (input.toLowerCase().startsWith("r"))
                    {
                       double temp;
                       Node n1 = new Node();
                       Node n2 = new Node();
                       n1.id = Integer.parseInt(value[1]);
                       n2.id = Integer.parseInt(value[2]);
                       temp = Double.parseDouble(value[3]);
                        Resistor r = new Resistor(temp, n1, n2);
                        cirElement.add(r);                              
                    }
                }
            }
            
        }
    }
    
    public void display()
    {
        System.out.println("Enter your input:");
    }
    
   public void spice()
   {
       for(Object o : cirElement)
       {
           System.out.println(o);
       }
    }
   
   public void end()
   {
       System.out.println("All done");
   }
   
   public static void main(String[] args)
   {
       UserMain m = new UserMain();
       m.start();
   }
}


/*
v 1 0 2.0
r 1 2 0.25
v 2 0 3
r 2 3 0.5
r 3 0 1.0
spice

V1 1 0 DC 2.0
R1 1 2 0.25
V2 2 0 DC 3.0
R2 2 3 0.5
R3 3 0 1.0
end
*/