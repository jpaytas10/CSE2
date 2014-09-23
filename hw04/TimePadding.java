////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 22, 2014
//CSE2
//Hw04 Pt. IV
//Time Padding Java Program
//Created to convert number of seconds passed in a day to conventional time format.
//
//  first compile the program
//      javac TimePadding.java
//  then run the program
//      java TimePadding

    import java.util.Scanner;
    
//define the class
public class TimePadding {
    
    //define the method
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the time elapsed today, in seconds: ");
        int nSecondsEntered = myScanner.nextInt();
        
        //hours calculation
        int nHours = ((int)(nSecondsEntered/60/60));
        
        //minutes calculation
        int nMinutes = ((int)(nSecondsEntered/60)- 60);
        
        //seconds remaining calculation
        int nSecondsRemaining = nSecondsEntered - ((nHours*60)*60);
        
        //seconds calculation
        int nSeconds = nSecondsRemaining - (nMinutes*60);
        
        
        if (nMinutes < 10 && nSeconds < 10) {
            System.out.println("The time is "+nHours+" :0"+nMinutes+ " :0" +nSeconds+ ".");
        } //end of first if statement
        
            else if (nMinutes < 10) {
                System.out.println("The time is "+nHours+" :0"+nMinutes+ " :" +nSeconds+ ".");
            } //end of second if statement
        
            else if (nSeconds < 10) {
                System.out.println("The time is "+nHours+" :"+nMinutes+ " :0" +nSeconds+ ".");
            } //end of third if statement
        
        else {
            System.out.println("The time is "+nHours+" :"+nMinutes+ " :" +nSeconds+ ".");
        } //end of else statement, serves as a "catch-all"
        
        
    } //end of method
    
} //end of class