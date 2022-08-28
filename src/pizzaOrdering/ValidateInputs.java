/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaOrdering;

import java.util.InputMismatchException;


/**
 *
 * @author kst0629
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;



public class ValidateInputs {
    
  
     
    public boolean isValidInput(String input) {
     try {
         Integer.parseInt(input);
     } catch (NumberFormatException e) {
         if (input.equalsIgnoreCase("x")) {
             return true;
         }
         System.out.println("Invalid Input.\nPlease input your answer again: ");
         return false;
     }
     return true;
 }
    
    public static void createFile(String fileTitle){
        try{
            File customerFile = new File(fileTitle + ".txt");
            if(customerFile.createNewFile()){
                System.out.println(fileTitle + ".txt was created");
            }
        }
        catch(IOException error){
            System.out.println("Error" + fileTitle +".txt had a problem. please try again.");
        }
    }
    
    
    
}
    

