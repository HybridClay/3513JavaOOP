

package com.mycompany.lab02;
// TASK #2 Add an import statement for the Scanner class
import java.util.Scanner;


public class Lab02 {

    public static void main(String[] args) {


// TASK #2 Create a Scanner object here
Scanner scan = new Scanner(System.in);
// Identifier declarations
final double NUMBER = 2 ; // Number of scores
final double SCORE1 = 100; // First test score
final double SCORE2 = 95; // Second test score
final int BOILING_IN_F = 212; // Boiling temperature
int fToC; // Temperature Celsius
double average; // Arithmetic average
String output; // Line of output
// TASK #2 declare variables used here
String fname;
String lname;
// TASK #3 declare variables used here
char firstInitial;
// TASK #4 declare variables used here
double diameter;
double radius;
double volume;
// Find an arithmetic average.
average = (SCORE1 + SCORE2) / NUMBER;
output = SCORE1 + " and " + SCORE2 +
" have an average of " + average;
System.out.println(output);
// Convert Fahrenheit temperature to Celsius.
fToC = ( 5 * (BOILING_IN_F - 32) )/9;
output = BOILING_IN_F + " in Fahrenheit is " +
fToC + " in Celsius.";
System.out.println(output);
System.out.println(); // To leave a blank line
// ADD LINES FOR TASK #2 HERE
// Prompt the user for first name
System.out.print("What is your first name? ");
fname = scan.nextLine();
// Read the user's first name
System.out.println("Your first name is " + fname);
// Prompt the user for last name
System.out.print("What is your last name? ");
lname = scan.nextLine();
// Read the user's last name
System.out.println("Your last name is " + lname);
// Concatenate the user's first and last names
String fullName = fname + " "  + lname;
// Print out the user's full name
System.out.println("Your full name is " + fullName);
System.out.println(); // To leave a blank line
// ADD LINES FOR TASK #3 HERE
// Get the first character from the user's first name
firstInitial = fname.charAt(0);
// Print out the user's first initial
System.out.println("Your first initial is " + firstInitial);
// Convert the user's full name to uppercase
fullName = fullName.toUpperCase();
// Print out the user's full name in uppercase
System.out.println("Your full name in Upper Case is " + fullName);
//Getting the length of fullName
System.out.println("Value of fullName and how many characters = " + fullName.length());
System.out.println(); // To leave a blank line
// ADD LINES FOR TASK #4 HERE
// Prompt the user for a diameter of a sphere
System.out.print("Enter the diameter of a sphere: ");
// Read the diameter
diameter = scan.nextDouble();
// Calculate the radius
radius = diameter/2;
// Calculate the volume
volume = ( 4 * Math.PI * Math.pow(radius, 3) )/3;
// Print out the volume
   System.out.println("The volume of the sphere is: " + volume);     
        
    }
}
