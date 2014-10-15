/////////////////////////////////////////////////////////////
//Jake Paytas
//CSE2
//October 14, 2014
//Homework 6 Pt. II: Root
//This program is created to find the square root of a number using the bisection method

//first compile the program
//      javac Root.java
//then run the program
//      java Root

import java.util.Scanner;

//define the class
public class Root {
    
    //define the method
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Please enter a positive double:");
        
        double x = myScanner.nextDouble();
        
        double low  = 0.00;
        double high = 1.00 + x;
        double middle = 0.5;
        
        while ( (high-low) > .0000001) {
            middle = (high + low)/2;
                if ((middle*middle) > x){
                    high = middle; //first bisection, changes the middle to new high
                } //end of nested if
                else{
                    low = middle; //first bisection, changes the middle to the new low
                } //end of nested else
        } //end of loop
        
        System.out.println("The square root of the number you entered is: "+middle);
        
    }//end of method
} //end of class