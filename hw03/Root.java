/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 15, 2014
//CSE2
//Hw03 Pt. 2
//Root Java Program
//Created to crudely estimate the cube root of a number, then reciprocate what that crude estimate equals when cubed.

//  first compile the program
//      javac Root.java
//  then run the program
//      java Root

    import java.util.Scanner;
    
//define the class
public class Root {
    
    //define the method
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter a number: " ); //user inputs any number
        double x= myScanner.nextDouble();
        
        double firstGuess= (x/3);
        System.out.println("My first estimate is: "+(firstGuess)+ ".");
        
        double secondGuess= ((firstGuess*firstGuess*firstGuess+x)/(3*firstGuess*firstGuess));
        System.out.println("My second estimate is: "+(secondGuess)+ ".");
        
        double thirdGuess= ((2*secondGuess*secondGuess*secondGuess+x)/(3*secondGuess*secondGuess));
        System.out.println("My third estimate is: "+(thirdGuess)+ ".");
        
        double fourthGuess= ((2*thirdGuess*thirdGuess*thirdGuess+x)/(3*thirdGuess*thirdGuess));
        System.out.println("My fourth estimate is: "+(fourthGuess)+ ".");
        
        double guessCubed= (fourthGuess*fourthGuess*fourthGuess);
        System.out.println("MY FOURTH ESTIMATE CUBED IS: " +(guessCubed)+ ".");
        
    } //end of method
    
} //end of class