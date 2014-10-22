//////////////////////////
//Jake Paytas
//CSE2
//Lab07: LoopTheLoop
//Designed to practice using while and nested while loops

import java.util.Scanner;

public class LoopTheLoop {
    
    public static void main (String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Please enter an integer from 1 to 15: ");
        
    if (myScanner.hasNextInt()){
        
        int nStars = myScanner.nextInt();
        int counter= 1;
        int counter1 = 1;
        
        if ((nStars >= 1) && (nStars <= 15)){
            
        
        while (counter <= nStars){
            
                while (counter1 <= counter){
                    System.out.print("*");
                    counter1++;
                } //end of nested loop
                
            System.out.println();
            counter1 = 1;
            counter++;
        }//end of while loop
        
        } //end of range if
        else {
            System.out.println("Out of range.");
            return;
        }
        
    }//end of hasnextint if  
    else {
        System.out.println("Bad input.");
        return;
    }
    
    }//end of method
    
}//end of class