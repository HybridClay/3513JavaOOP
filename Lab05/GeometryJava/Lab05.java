
package com.mycompany.lab05;

import java.util.Scanner;
/**
This program demonstrates static methods
*/

public class Lab05 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int choice; // The user's choice
double value = 0; // The method's return value
char letter; // The user's Y or N decision
double radius; // The radius of the circle
double length; // The length of the rectangle
double width; // The width of the rectangle
double height; // The height of the triangle
double base; // The base of the triangle
double side1; // The first side of the triangle
double side2; // The second side of the triangle
double side3; // The third side of the triangle
// Create a scanner object to read from the keyboard
Scanner keyboard = new Scanner(System.in);
// The do loop allows the menu to be displayed first
do
{
// TASK #1 Call the printMenu method
    printMenu();
choice = keyboard.nextInt();
switch (choice)
{
case 1:
System.out.print("Enter the radius of " +
"the circle: ");
radius = keyboard.nextDouble();
// TASK #3 Call the circleArea method and
// store the result in the value variable
value = circleArea(radius);
System.out.println("The area of the " +
"circle is " + value);
break;
case 2:
System.out.print("Enter the length of " +
"the rectangle: ");
length = keyboard.nextDouble();
System.out.print("Enter the width of " +
"the rectangle: ");
width = keyboard.nextDouble();
// TASK #3 Call the rectangleArea method and
// store the result in the value variable
value = rectangleArea(length, width);
System.out.println("The area of the " +
"rectangle is " + value);
break;
case 3:
System.out.print("Enter the height of " +
"the triangle: ");
height = keyboard.nextDouble();
System.out.print("Enter the base of " +
"the triangle: ");
base = keyboard.nextDouble();
// TASK #3 Call the triangleArea method and
// store the result in the value variable
value = triangleArea(height,base);
System.out.println("The area of the " +
"triangle is " + value);
break;
case 4:
System.out.print("Enter the radius of " +
"the circle: ");
radius = keyboard.nextDouble();
// TASK #3 Call the circumference method and
// store the result in the value variable
value = circleCircumference(radius);
System.out.println("The circumference " +
"of the circle is " +
value);
break;
case 5:
System.out.print("Enter the length of " +
"the rectangle: ");
length = keyboard.nextDouble();
System.out.print("Enter the width of " +
"the rectangle: ");
width = keyboard.nextDouble();
// TASK #3 Call the perimeter method and
// store the result in the value variable
value = rectanglePerimeter(length,width);
System.out.println("The perimeter of " +
"the rectangle is " +
value);
break;
case 6:
System.out.print("Enter the length of " +
"side 1 of the " +
"triangle: ");
side1 = keyboard.nextDouble();
System.out.print("Enter the length of " +
"side 2 of the " +
"triangle: ");
side2 = keyboard.nextDouble();
System.out.print("Enter the length of " +
"side 3 of the " +
"triangle: ");
side3 = keyboard.nextDouble();
// TASK #3 Call the perimeter method and
// store the result in the value variable
value = trianglePerimeter(side1, side2, side3);
System.out.println("The perimeter of " +
"the triangle is " +
value);
break;
default:
System.out.println("You did not enter " +
"a valid choice.");
}

keyboard.nextLine(); // Consume the new line
System.out.println("Do you want to exit " +
"the program (Y/N)?: ");
String answer = keyboard.nextLine();
letter = answer.charAt(0);
} while(letter != 'Y' && letter != 'y');

        
        
        
        
    }
    
    // TASK #1 Create the printMenu method here
    public static void printMenu(){
        System.out.println("This is a geometry calculator");
        System.out.println("Choose what you would like to calculate");
        System.out.println("""
                           1. Find the area of a circle 
                           2. Find the area of a rectangle 
                           3. Find the area of a triangle 
                           4. Find the circumference of a circle 
                           5. Find the perimeter of a rectangle 
                           6. Find the perimeter of a triangle""");
        System.out.print("Enter the number of you choice: ");
        
    }
    // TASK #2 Create the value-returning methods here
    /**
     * This Calculates the area of a circle.
     * It requires the user to input the radius to be calculated in to the formula
     * @param radius The radius of the circle
     * @return The area of the circle
    */
    public static double circleArea(double radius){
        double Area = Math.PI * Math.pow(radius, 2);
        return Area;
    }
    
    /**
     * Calculates the area of a rectangle
     * It requires the user to input the length and width to be put into the formula
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     * @return The area of the rectangle
     */
    public static double rectangleArea(double length, double width){
        double Area = length * width;
        return Area;
    }
    
    /**
     * This calculates the area of a triangle
     * It requires the user to enter the height and base to be calculates into the formula
     * @param height The height of the triangle
     * @param base The base of the triangle
     * @return The area of the triangle
     */
    public static double triangleArea(double height, double base){
        double Area = (height * base)/2;
        return Area;
    }
    
    /**
     * This calculates the circumference of a circle
     * It requires the user to enter the radius
     * @param radius The radius of the circle
     * @return The circumference of the circle
     */
    public static double circleCircumference(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
    
    /**
     * Calculates the perimeter of a rectangle
     * It requires the length and width of the rectangle
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     * @return The perimeter of the rectangle
     */
    public static double rectanglePerimeter(double length, double width){
        double perimeter = (2*length)+(2*width);
        return perimeter;
    }
    
    /**
     * Calculates the perimeter of a triangle
     * It requires the three side of a triangle
     * @param side1 The length of side 1 of the triangle
     * @param side2 The length of side 2 of the triangle
     * @param side3 The length of side 3 of the triangle
     * @return The perimeter of the triangle
     */
    public static double trianglePerimeter(double side1, double side2, double side3){
        double perimeter = side1+ side2 + side3;
        return perimeter;
    }
    
}
