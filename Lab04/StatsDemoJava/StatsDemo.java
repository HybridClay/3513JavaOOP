
package com.mycompany.lab04;


import java.util.Scanner;
// TASK #3 Add the file I/O import statement here
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
/**
This class reads numbers from a file, calculates the
mean and standard deviation, and writes the results
to a file.
*/

public class StatsDemo {
    
    // TASK #3 Add the throws clause
public static void main(String[] args) throws IOException {
double sum = 0; // The sum of the numbers
int count = 0; // The number of numbers added
double mean = 0; // The average of the numbers
double stdDev = 0; // The standard deviation
String line; // To hold a line from the file
double difference; // The value and mean difference
// Create an object of type Scanner
Scanner keyboard = new Scanner (System.in);
String filename; // The user input file name
// Prompt the user and read in the file name
System.out.println("This program calculates " +
"statistics on a file " +
"containing a series of numbers");
System.out.print("Enter the file name: ");
filename = keyboard.nextLine();
    // ADD LINES FOR TASK #4 HERE
// Create a FileReader object passing it the filename
FileReader reader = new FileReader(filename);
// Create a BufferedReader object passing FileReader
// object
BufferedReader br = new BufferedReader(reader);
// Perform a priming read to read the first line of
// the file
line = br.readLine();
// Loop until you are at the end of the file
while(true){
    if(line == null){
        break;
    }
// Convert the line to a double value and add the
// value to sum
    else{
          sum += Double.parseDouble(line);
        }
// Increment the counter
count++;
// Read a new line from the file
line = br.readLine();
}// Close the input file
br.close();
// Store the calculated mean
mean = sum / count;
    // ADD LINES FOR TASK #5 HERE
// Reconnect FileReader object passing it the
// filename
FileReader fileReader = new FileReader(filename);
// Reconnect BufferedReader object passing
// FileReader object
BufferedReader buffReader = new BufferedReader(fileReader);
// Reinitialize the sum of the numbers
sum = 0;
// Reinitialize the number of numbers added
count = 0;
// Perform a priming read to read the first line of
// the file
line = buffReader.readLine();
// Loop until you are at the end of the file
while(true){
    
    if(line == null){
        break;
    }
// Convert the line into a double value and
// subtract the mean
    else{
        difference = Double.parseDouble(line) - mean;
// Add the square of the difference to the sum
        sum += Math.pow(difference, 2);
    }
// Increment the counter
count++;
// Read a new line from the file
line = buffReader.readLine();
}// Close the input file
buffReader.close();
// Store the calculated standard deviation
double variance = sum/count;
stdDev = Math.sqrt(variance);
    // ADD LINES FOR TASK #3 HERE
// Create a FileWriter object using "Results.txt"
FileWriter writer = new FileWriter("Results.txt");
// Create a PrintWriter object passing the
// FileWriter object
PrintWriter output = new PrintWriter(writer);
// Print the results to the output file
output.printf("Mean = %.3f \n\n", mean);
output.printf("Standard Deviation = %.3f", stdDev);
// Close the output file
output.close();



}
       
}
