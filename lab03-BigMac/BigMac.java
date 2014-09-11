////////////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 11, 2014
//CSE2
//Lab 03
//BigMac Java Program
//Created to calculate total cost of a Big Mac order, based on quantity and state sales tax
//
//  first compile the program
//      javac BigMac.java
//  then run the program
//      java BigMac//

    import java.util.Scanner;

//  define the class
public class BigMac{
    
    //define the method
    public static void main (String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        
        int nBigMacs = myScanner.nextInt();
        
        System.out.print("Enter the cost per Big Mac as"+ " a double (in the form xx.xx): ");
        double bigMac$= myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate= myScanner.nextDouble();
        taxRate/=100; //user enters percent, but I want to use proportion
        
        double cost$;
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for storing digits to the right of the decimal point for cost$
        cost$= nBigMacs*bigMac$*(1+taxRate); //gets the whole amount, dropping decimal fraction
        dollars= (int) cost$;
        //gets dimes amount, e.g.,
        // (int) (6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder after the divison
        //583 % 100 -> 83, 27 % 5 -> 2
        dimes= (int) (cost$*10) % 10;
        pennies= (int) (cost$*100) % 10;
        
        System.out.println("The total cost of "+ nBigMacs+" at $"+ bigMac$+" per Big Mac, with a "+"sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
        
        
    } //end of main method
    
} //end of class