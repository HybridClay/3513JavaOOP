
package com.mycompany.lab02;

//We import the Java Scanner class here
import java.util.Scanner;


public class Task5 {
    
    public static void main(String[] args){
        //Here we are declaring our variables
        double miles;
        double gallon;
        double milesPerGallon;
        //We create a Scanner object here
        Scanner input = new Scanner(System.in);
        //Prints a line indicating this program will calculate mileage
        System.out.println("This program will calculate mileage!");
        //Adds a space line
        System.out.println("");
        //A prompt to user asking for mileage driven
        System.out.print("What are your miles driven? ");
        //Read in miles driven
        miles = input.nextDouble();
        //Prompts to user asking for gallons used
        System.out.print("What are your gallons used? ");
        //Read in gallons used
        gallon = input.nextDouble();
        //Calculate miles per gallon by dividing miles driven by gallons used
        milesPerGallon = miles/gallon;
        //Print miles per gallon along with appropiate labels
        System.out.println("Miles per gallon: " + milesPerGallon + "mpg");
        
        
    }
    
}
