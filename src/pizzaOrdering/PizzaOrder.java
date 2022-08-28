/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaOrdering;

/**
 *
 * @author kst0629
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;



public class PizzaOrder {
    private ArrayList<Pizza> pizzaTypes;
    private final HashMap<String, Customer> customers;
    private final String fileName;
    
    //creating the objects with the kinds of pizza and price
    Pizza Pepperoni = new Pizza("Pepperoni", 13.00);
    Pizza Meatlover = new Pizza("Meatlover", 15.00);
    Pizza Hawaiian = new Pizza("Hawaiian", 10.00);
    Pizza Vegeterian = new Pizza("Vegeterian", 13.00);
    Pizza Margherita = new Pizza("Margherita", 13.00);
        
     
   
    
    //constructor
    public PizzaOrder(){
        //initializing the ArrayList
        pizzaTypes = new ArrayList<>();
        
        this.fileName = "./resources/customer.txt";
        this.customers = new HashMap();
       
        
        //adding the objects into the ArrayList
        pizzaTypes.add(Pepperoni);
        pizzaTypes.add(Meatlover);
        pizzaTypes.add(Hawaiian);
        pizzaTypes.add(Vegeterian);
        pizzaTypes.add(Margherita);
        
    }
    
    //prints out the ArrayList element that is being called.
    public String getNPizza(int input){
        String output="";
        for(Pizza p : pizzaTypes){
             output = String.valueOf(pizzaTypes.get(input).toString());
        }
         return output;
    }
    
    //calculate the cost of the pizzas ordered
    public double calculatePrice(int input){
        double cost = 0;
            for(Pizza p: pizzaTypes){
                cost  =  p.getCost();
            }
        return cost;
    }
    
    //Prints out the pizzas in a menu.
    @Override
    public String toString(){
        String output = "";  
            for(Pizza p: pizzaTypes){
                output += p;    
            }
        return output;
    }
    
    // will add the customer details to resource file.
    public void printReceipt(Customer customer){
        this.customers.put(customer.getName(), customer);
        try( FileWriter fw = new FileWriter(this.fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw)){
         
            for(Customer c : this.customers.values()){
                pw.println(c.getName() + " " +  c.getPhoneNumber()+ " " + c.getAddress());
            }
                pw.close();
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
}
