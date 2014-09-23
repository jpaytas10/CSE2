////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 22, 2014
//CSE2
//Hw04 Pt. II
//Month Java Program
//Created to display the number of days in each month.
//
//  first compile the program
//      javac Month.java
//  then run the program
//      java Month

    import java.util.Scanner;
    
//define the class
public class Month {
    
    //define the method
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter an int giving the number of the month (1-12): ");
        int nMonth = myScanner.nextInt();
        
        if ((nMonth == 1) || (nMonth == 3) || (nMonth == 5) || (nMonth == 7) || (nMonth == 8) || (nMonth == 10) || (nMonth == 12)) {
            System.out.println ("The month has 31 days.");
        } //end of if statement
        
        else if ((nMonth == 4) || (nMonth == 6) || (nMonth == 9) || (nMonth == 11)) {
            System.out.println ("The month has 30 days.");
        } //end of first else if statement
        
        else if (nMonth==2) { //if the month entered is february
            System.out.print("What year? ");
                int nYear = myScanner.nextInt();
            
                    if (nYear % 4 == 0) {
                        System.out.println("The month has 29 days.");
                    } //end of nested if statement
                    else {
                        System.out.println("The month has 28 days.");
                    } //end of nested else
        } //end of second else if statement
        
        else {
            System.out.println ("You did not enter an integer between 1 and 12.");
            return; //terminates program
        } //end of else statement
        
    } //end of method
    
} //end of class