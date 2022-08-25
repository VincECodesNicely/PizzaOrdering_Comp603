/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp603_project1;

import java.util.InputMismatchException;


/**
 *
 * @author kst0629
 */
//checks if the input is x if not will validate it.
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
}
    

