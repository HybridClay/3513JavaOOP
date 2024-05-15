//TimeDemo.java

package com.mycompany.lab09;

import java.util.Scanner;

/**
This program demonstrates the Time class.
*/

public class Lab09 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        char answer = 'Y';
        String enteredTime;
        String response;
        while (answer == 'Y') //Step 4.
        {
            System.out.print("Enter a military time " +
            "using the ##:## format: ");
            enteredTime = keyboard.nextLine();
            Time now = new Time (enteredTime);
            System.out.println("Do you want to enter " +
            "another (Y/N)? ");
            response = keyboard.nextLine();
            answer = response.charAt(0);
            
            if(answer == 'y'){
                answer = Character.toUpperCase(answer);
            }

        }
        
    }
}
