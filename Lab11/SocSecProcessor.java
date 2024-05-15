

package com.mycompany.socsecprocessor;

import java.util.Scanner;


public class SocSecProcessor {

    public static void main(String[] args) {
        
        String name;
        String ssn;
        char answer = 'Y';
        String response;
        Scanner input = new Scanner(System.in);
        
        while(answer == 'Y'){
           
            System.out.print("Name? ");
            name = input.nextLine();
            System.out.print("SSN? ");
            ssn = input.nextLine();
        
            try{
                isValid(ssn);   
                System.out.println(name + " " + ssn + " is valid");
            }
            catch(SocSecException error){
                System.out.println(name + " " + ssn + " " + error.getMessage());
            }
            System.out.print("Coninue? ");
            response = input.nextLine();
            answer = response.charAt(0);
            
            if(answer == 'y'){
                answer = Character.toUpperCase(answer);
            }
        }
        
        
    }
    
    
    public static boolean isValid(String ssn) throws SocSecException{
        if(ssn.length() != 11){
            throw new SocSecException("wrong number of characters");
        }
        else if(ssn.charAt(3) != '-' || ssn.charAt(6) !='-'){
                throw new SocSecException("dashes at wrong positions");
        }
        
        for(int index = 0; index < ssn.length(); index++){
            if(index != 3 && index != 6){
                if (!Character.isDigit(ssn.charAt(index))){
                    throw new SocSecException ("contains a character that is not a digit"); 
                }
            } 
        }
        
        return true;
    }

}
