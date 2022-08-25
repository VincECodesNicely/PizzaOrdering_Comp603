/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaOrdering;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author kst0629
 */
public class Menu extends ValidateInputs {
    PizzaOrder po = new PizzaOrder();
    
    private final String pizzaCommands[] = {"Print Menu", "Order Pizza", "Leave Vincent's Pizzeria"};
    
    
    public Menu(){
        
    }
    
    public void displayChoices(){
        System.out.println("\nWelcome to Vincent's Pizzeria.");
        System.out.println("+============================+");
        System.out.println("Enter a number to execute a option: ");
        
        System.out.println("A. " + pizzaCommands[0]);
        System.out.println("B. " + pizzaCommands[1]);
        System.out.println("X. " + pizzaCommands[2]);
        
    }
   
      public void printOptions()
    {
	 //Print Menu Message
	
        char choice;
        Scanner input = new Scanner(System.in);
        PizzaOrder po = new PizzaOrder();
        
        do{
        displayChoices();
        choice = input.next().trim().toUpperCase().charAt(0);
        
        switch(choice){
            case 'A':{
                System.out.println(po.toString());
                break;
            }
            case 'B':{
                orderPizza(input);
                break;
            }
            case 'X':{
                System.out.println("Extiting Vincent's pizzeria");
            }
        }
        
        }while(choice != 'X');   
    }
   
        private void orderPizza(Scanner input){
            PizzaOrder po = new PizzaOrder();

            input.nextLine();//enters enter. without this nextLine here, name and phonenumber would have printed at the same time
            System.out.println("Enter name: ");
            String name = input.nextLine();

            System.out.println("Enter Phone Number: ");
            String phoneNumber = input.nextLine();

            System.out.println("Enter Address");
            String address = input.nextLine();

            Customer c = new Customer(name, phoneNumber, address);
            System.out.println(c.toString()); 
            c.userExists(name);

            //asking for the number of pizzas 
            String numOfPizza;
            System.out.println("How many pizzas would you like to order? ((x) to quit ordering pizzas)");

            //do while loop for the method isValidInput() to check if the string is right
            do{
                numOfPizza = input.nextLine();
            }while(!this.isValidInput(numOfPizza));

            if(numOfPizza.equalsIgnoreCase("x")){
               return;
            }

            int number = Integer.parseInt(numOfPizza);

            System.out.println(po.toString());

            int i =0;
            while(i < number){
            String wantToQuit;
            System.out.println("What Pizza/s would you like to order: ((x) to quit ordering pizzas)");
            System.out.println("+===================================+");

            //do while loop for the method isValidInput() to check if the string is right
            do{
                wantToQuit = input.nextLine();
            }while(!this.isValidInput(wantToQuit));

            if(wantToQuit.equalsIgnoreCase("x")){
               break;
            }

                int pizzaChoice = Integer.parseInt(wantToQuit);// converts the string back to integer so my if statement can check for integer inputs.
                if(pizzaChoice >= 0 && pizzaChoice <= 4 ){
                    System.out.println("You ordered: " + po.getNPizza(pizzaChoice));
                }
                else{
                    System.out.println("Invalid input. Please try again.");
                }
                i++;
            }
     }
   
    
  
    
}
