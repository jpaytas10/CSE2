/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 15, 2014
//CSE2
//Hw03 Pt. 3
//FourDigits Java Program
//Created to indicate the first four digits to the right of a user-entered double

//  first compile the program
//      javac FourDigits.java
//  then run the program
//      java FourDigits

    import java.util.Scanner;
    
//define the class
public class FourDigits {
    
    //define the method
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter a double and display the four digits to the right of the decimal point: "); //user inputs their number
        double enteredNumber= myScanner.nextDouble();
        
        int cutDigits = (int) enteredNumber;
        int inBetween = (cutDigits*10000);
        double rawNumber = (enteredNumber*10000);
        
        double fourDigitsDouble = (rawNumber-inBetween);
        int fourDigits= (int) fourDigitsDouble;
        
        System.out.println("The four digits to the right of the decimal point are: " + (fourDigits)+ ".");
        
    } //end of method
    
} //end of class