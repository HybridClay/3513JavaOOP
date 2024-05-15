
package com.mycompany.lab09;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class TokenText {
    
    public static void main(String[] args) throws FileNotFoundException {
        
     	// Create FileReader object
	FileReader file = new FileReader("secret.txt");

	// Implement a scanner to read the file
	Scanner scan = new Scanner(file);

	// Read to the end of the file
	while (scan.hasNextLine()) {
		String str = scan.nextLine();
		String tokens[] = str.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < tokens.length; i++) {
			if (i % 5 == 0) {
                            sb.append(tokens[i].toUpperCase().charAt(0));	
			}
		}
        System.out.print(sb.toString());
	}
     
    }
    
}
