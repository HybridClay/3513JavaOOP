//TASK#1 AVERAGE CLASS
package com.mycompany.labarrays;

import java.util.Scanner;


public class Average {
    
    private int[] data;
    private double mean;
    
    
    public Average(){
        Scanner input = new Scanner(System.in);
        data = new int[5];
        for(int i = 0; i < data.length; i ++){
             System.out.print("Enter score number" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        selectionSort();
        calculateMean();
    }
    
    
    public void calculateMean(){
        int total = 0;
        for(int i = 0; i<data.length; i++){
            total += data[i];
        }
        mean = (double)total/data.length; //Dividing an int by int into a double will give you the intDouble. So typecast it to give your answer in correct double decimal 
        //System.out.println("The mean is: " + mean);
    }
    
    
    @Override
    public String toString(){
        String myString = "The data scores in descending order are: ";
        for(int i = 0; i< data.length; i++){
            myString = myString + data[i] + " ";  //Same as if it were myString += data[i] because numbers are just being added on to the String
        }
        
        myString = myString + "\nmean= " + mean; //Like here, the mean is being added to be part of myString
        return myString;
    }
    
    
    public void selectionSort(){
        for(int i = 0; i < data.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < data.length; j++){
                if(data[min] < data[j]){ //NOTE: To have it sorted in ascending order just swap the sign with >  
                min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
    
    
}
