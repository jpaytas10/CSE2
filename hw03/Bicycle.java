/////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 15, 2014
//CSE2
//Hw03 Pt. 1
//Bicycle Java Program
//Created to calculate total distance traveled (in miles) and average speed (in mph)
//of bicycle trips.
//
//  first compile the program
//      javac Bicycle.java
//  then run the program
//      java Bicycle//

    import java.util.Scanner;
    
//  define the class
public class Bicycle{
    
    //define the method
    public static void main(String [] args) {
        
        double wheelDiameter = 27.0;            //constant, diameter of wheel in inches
        double PI=3.14159;                      //constant, pi
        int feetPerMile=5280;                   //constnat, the number of feet in a mile
        int inchesPerFoot=12;                   //constant, the number of inches in a foot
        int secondsPerMinute=60;                //constant, the number of seconds in a minute
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter the number of seconds: " ); //user starts inputting data
        int nSeconds = myScanner.nextInt();
        
        System.out.print("Enter the number of counts: " );  //input data
        int nCounts = myScanner.nextInt();
        
        //define new variables
        double nMiles = ((((nCounts*wheelDiameter*PI)/inchesPerFoot)/feetPerMile));
        float nMilesFloat = (float) nMiles;
        int nMinutes = (nSeconds/secondsPerMinute);
        double nMinutesDouble = (double) nMinutes;
        double avgSpeed = (((nMilesFloat)/nMinutes)*secondsPerMinute);
        float avgSpeedFloat = (float) avgSpeed;
        
        //print out results
        System.out.println("The distance was " +(nMilesFloat)+ " miles and took " +(nMinutesDouble)+ " minutes.");
        System.out.println("The average mph was " +(avgSpeedFloat)+ ".");
        
        
    
    } //end of main method
    
} //end of class