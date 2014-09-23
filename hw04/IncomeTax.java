////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 22, 2014
//CSE2
//Hw04 Pt. I
//Income Tax Java Program
//Created to calculate amount of tax on different incomes.
//
//  first compile the program
//      javac IncomeTax.java
//  then run the program
//      java IncomeTax

    import java.util.Scanner;
    
//define the class
public class IncomeTax {
    //define the method
    public static void main (String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        double taxRate0 = .05; //first rate
        double taxRate1 = .07; //second rate
        double taxRate2 = .12; //third rate
        double taxRate3 = .14; //fourth rate
        
        System.out.print("Enter an int giving the number in thousands: "); //user prompt
        int incomeInt = myScanner.nextInt();
        int incomeThou = incomeInt*1000; //converting to thousands
        
        if ((incomeInt < 20) && (incomeInt>=0)) {
            System.out.println("The tax rate on $" +(incomeThou)+ " is 5%, and the tax is $" +(((int)(taxRate0*incomeThou)*100)/100.0)+ ".");
        }//end of first if statement
        else if ((incomeInt >= 20) && (incomeInt < 40)) { //new range
             System.out.println("The tax rate on $" +(incomeThou)+ " is 7%, and the tax is $" +(((int)(taxRate1*incomeThou)*100)/100.0)+ ".");
        } //end of second if statement
         else if ((incomeInt >= 40) && (incomeInt < 78)) { //new range
             System.out.println("The tax rate on $" +(incomeThou)+ " is 7%, and the tax is $" +(((int)(taxRate2*incomeThou)*100)/100.0)+ ".");
        } //end of third if statement
         else if (incomeInt >= 78) { //new range
             System.out.println("The tax rate on $" +(incomeThou)+ " is 7%, and the tax is $" +(((int)(taxRate3*incomeThou)*100)/100.0)+ ".");
        } //end of third if statement
        
        else {
            System.out.println("You did not enter a positve int.");
            return; //program terminates
        }
    } //end of method
    
} //end of class