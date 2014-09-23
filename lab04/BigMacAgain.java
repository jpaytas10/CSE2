////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 19, 2014
//CSE2
//Lab 04
//Big Mac Again Java Program
//Created to calculate total cost of a Burger/Fries Order under specific conditions

//  first compile the program
//      javac BigMacAgain.java
//  then run the program
//      java BigMacAgain

    import java.util.Scanner;
    
// define the class
public class BigMacAgain {
    
    //define the method
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        int nBigMacs = 0;
        double costBigMac = 2.22; //cost of Big Macs
        double costFries = 2.15; //cost of Fries
        
        System.out.print("Enter the number of Big Macs: ");
        
        if (myScanner.hasNextInt()) {
                nBigMacs = myScanner.nextInt();
                double costTotalRaw = (nBigMacs*costBigMac);
                System.out.println("You ordered " +(nBigMacs)+ " Big Macs at a cost of " +(costBigMac)+ " each for a total of $"+(costTotalRaw)+".");
                
                
        } //end of first if statement
        else {
            System.out.println("You did not enter an integer.");
            return; //leaves program, terminates
        } //end of else statement
        
        String friesYayNay = "";
        System.out.print("Do you want an order of fries? (Y/y/N/n)");
        String response = myScanner.next();
        
        if (response.equals("Y") || response.equals("y")) { //if user says yes
            System.out.println("The cost of fries is: $"+costFries+".");
             double costTotalYes = (nBigMacs*costBigMac + (costFries));
        //calculate total
        System.out.println("The total cost of your meal is $" +(costTotalYes)+ ".");
        } //end if statement
        
        else if (response.equals ("N") || response.equals("n")) {
            System.out.println("You ordered no fries.");
            double costTotalNo = (nBigMacs*costBigMac);
        //calculate total
        System.out.println("The total cost of your meal is $" +(costTotalNo)+ ".");
        } //end else if statement
        
        else {
            System.out.println("You did not input a correct letter.");
            return; //returns to previous question
        } //end else statement
        
    } //end of method
    
} //end of class