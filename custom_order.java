/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom_order;

import java.util.Scanner;

/**
 *
 * @author Prana
 */
public class Custom_order {

    /**
     * @param args the command line arguments
     */
     // TODO code application logic here
     // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
     // System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  
Scanner keyboard = new Scanner(System.in);
String firstName, itemOrder, frostingType, fillingType, toppings,input;
double cost = 15.00;
final double TAX_RATE = .08;
double tax;
	 
    // Introduce shop and prompt user to input first name
      
        System.out.println("Welcome to Java's Cake & Cupcake Shop!");
        System.out.println("We make custom cupcakes blah blah");
        
	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
        System.out.print("Please put in your name : ");
        firstName = keyboard.next();
        System.out.println("\n");
        System.out.println(firstName + ", please see our Menu below: ");
        System.out.println("\n");
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

System.out.println("_______________________________________________");      
System.out.println("        MENU         QUANTITY    BASE COST  ");
System.out.println("_______________________________________________"); 
System.out.println("        Cake             1            $15     ");
System.out.println("   Set of Cupcakes       6            $15     ");
System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
System.out.println("_______________________________________________");
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

    System.out.println("Do you want CUPCAKES or a CAKE?");
    itemOrder = keyboard.nextLine();
    
 
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

        System.out.println("What type of FROSTING do you want? ");
        System.out.println("Vanilla, Chocolate, Strawberry or Coco");
        frostingType = keyboard.nextLine();
        
   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING
    System.out.println("What type of FILLING do you want? ");
    System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
    fillingType = keyboard.nextLine();


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS

    System.out.println("What type of TOPPINGS do you want? ");
    System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
    toppings = keyboard.nextLine();
	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION
System.out.println();
System.out.println(firstName + " , your order is as follows: ");
System.out.println("_________________________________________");
System.out.println("Item Ordered: " + itemOrder);
System.out.println("Frosting: " + frostingType);
System.out.println("Filling: " + fillingType);
System.out.println("Toppings: " + toppings);
System.out.println("_________________________________________");

      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
    System.out.printf("The cost of your order is: $%.2f\n", cost);
    tax = cost * TAX_RATE;
    System.out.printf("The tax is: $%.2f\n", tax);
    System.out.printf("The total due is: $%.2f\n",(tax + cost));    
    }   
}