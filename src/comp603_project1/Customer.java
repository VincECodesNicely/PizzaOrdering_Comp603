/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp603_project1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author jazzy-wazzy
 */
public class Customer {
    private String name;
    private String phoneNumber;
    private String address;
    
    public Customer(String name, String phoneNumber, String address){
        this.name = name;
        this. phoneNumber = phoneNumber;
        this.address = address;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setAddress(String Address){
        this.address = address;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getAddress(){
        return address;
    }
    
    @Override
    public String toString(){
     return "\nName: " + this.name +  "\nPhone Number: "+  this.phoneNumber + "\nAddress:" + this.address ;  
    }
    
     //checks if user is already there, if not will add into the file.
    public File userExists(String input){
      try(FileWriter fw = new FileWriter("./resources/customer.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)){
            
            if(new Scanner (new File("./resources/customer.txt")).useDelimiter("\\Z").next().contains(input)){
            System.out.println("Name was found in the file");
            }
             else{
                 System.out.println("Name was not found, will be adding to file.");
                out.println(input);
                out.close();  
             }   
        }
        catch(IOException e){
            e.printStackTrace();
        }
      return null;
    }
    
}
