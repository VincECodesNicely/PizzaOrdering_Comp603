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

public class Pizza {
    private String pizzaName;
    private double pizzaCost;

    
    public Pizza(String pizzaName, double pizzaCost){
        this.pizzaName = pizzaName;
        this.pizzaCost = pizzaCost;
    }
    
    public double getCost(){
        return pizzaCost;
    }
    
    public void setCost(){
        this.pizzaCost = pizzaCost;
    }
    
    public String getName(){
        return pizzaName;
    }
    
    public void setName(){
        this.pizzaName = pizzaName;
    }
    
    @Override
    public String toString(){
        return "\n" +  pizzaName + ": $" + pizzaCost;
    }
    
}
