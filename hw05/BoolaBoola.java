////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 30, 2014
//CSE2
//HW 05
//BoolaBoola Java Program
//Created to quiz users on comparative statements by generating random problems.

//  first compile the program
//      javac BoolaBoola.java
//  then run the program
//      java BoolaBoola

    import java.util.Scanner;
    
//define the class
public class BoolaBoola {
    
    //define the method
    public static void main(String [] args) {
    
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
    int randomNo = ((int)(Math.random()*(2)));
    int randomNo2 = ((int)(Math.random()*(2)));
    int randomNo3 = ((int)(Math.random()*(2)));
    int conclusion = ((int)(Math.random()*(4) + 1));
    
    boolean firstBoola = true; //placeholder true statement
    boolean secondBoola = true;
    boolean thirdBoola = false; //placeholder false statement
    
//randomizing our Boola values
    switch (randomNo) {
        case 0:
            firstBoola = true;
            break;
        case 1:
            firstBoola = false;
            break;
    }//end of randomNo switch statement
    
    switch (randomNo2) {
        case 0:
            secondBoola = true;
            break;
        case 1:
            secondBoola = false;
            break;
            
    } //end of randomNo2 switch
    
    switch (randomNo3) {
        case 0:
            thirdBoola = true;
            break;
        case 1:
            thirdBoola = false;
            break;
            
    } //end of randomNo3 switch
    
    boolean compare  = firstBoola || secondBoola || thirdBoola;
    boolean compareA  = firstBoola || secondBoola || thirdBoola;
    boolean compareB  = firstBoola || secondBoola || thirdBoola;
    boolean compareC  = firstBoola || secondBoola || thirdBoola;
    boolean compare2 = firstBoola && secondBoola || thirdBoola;
    boolean compare2A = firstBoola && secondBoola || thirdBoola;
    boolean compare2B = firstBoola && secondBoola || thirdBoola;
    boolean compare2C = firstBoola && secondBoola || thirdBoola;
    boolean compare3 = firstBoola || secondBoola && thirdBoola;
    boolean compare3A = firstBoola || secondBoola && thirdBoola;
    boolean compare3B = firstBoola || secondBoola && thirdBoola;
    boolean compare3C = firstBoola || secondBoola && thirdBoola;
    boolean compare4 = firstBoola && secondBoola && thirdBoola;
    boolean compare4A = firstBoola && secondBoola && thirdBoola;
    boolean compare4B = firstBoola && secondBoola && thirdBoola;
    boolean compare4C = firstBoola && secondBoola && thirdBoola;
    
    switch (conclusion) {
        case 1:
            System.out.print("Is the statement: "+(firstBoola)+ "||" +(secondBoola)+ "||" +(thirdBoola)+ ". True (T or t) or False (F or f)?\n");
            String selection = "";
            selection = myScanner.next();
            switch (selection) {
                case ("T"):
                    if (compare==true) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare==false) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                break;
                case ("t"):
                    if (compareA==true) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compareA==false) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                break;
                case ("F"):
                    if (compareB==false) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compareB==true) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                break;
                case ("f"):
                    if (compareC==false) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compareC==true) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                break;    
                default:
                    System.out.println("You did not enter a proper letter.");
                    break;
                    
            } //end of first nested switch
        break;    
        case 2:
            System.out.print("Is the statement: "+(firstBoola)+ "&&" +(secondBoola)+ "||" +(thirdBoola)+ ". True (T or t) or False (F or f)?\n");
            String selection2 = "";
            selection2 = myScanner.next();
            switch (selection2) {
                case ("T"):
                    if (compare2==true) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare2==false) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;
                case ("t"):
                    if (compare2A==true) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare2A==false) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;
                case ("F"):
                    if (compare2B==false) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare2B==true) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;
                case ("f"):
                    if (compare2C==false) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare2C==true) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;    
                default:
                    System.out.println("You did not enter a proper letter.");
                    break;
                    
            } //end of second nested switch
        break;    
        case 3:
            System.out.print("Is the statement: "+(firstBoola)+ "||" +(secondBoola)+ "&&" +(thirdBoola)+ ". True (T or t) or False (F or f)?\n");
            String selection3 = "";
            selection3 = myScanner.next();
            switch (selection3) {
                case ("T"):
                    if (compare3==true) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare3==false) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;
                case ("t"):
                    if (compare3A==true) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare3A==false) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;
                case ("F"):
                    if (compare3B==false) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare3B==true) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;
                case ("f"):
                    if (compare3C==false) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare3C==true) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;    
                default:
                    System.out.println("You did not enter a proper letter.");
                    break;
                    
            } //end of third nested switch
        break;    
        case 4:
            System.out.print("Is the statement: "+(firstBoola)+ "&&" +(secondBoola)+ "&&" +(thirdBoola)+ ". True (T or t) or False (F or f)?\n");
            String selection4 = "";
            selection4 = myScanner.next();
            switch (selection4) {
                case ("T"):
                    if (compare4==true) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare4==false) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;
                case ("t"):
                    if (compare4A==true) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare4A==false) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;
                case ("F"):
                    if (compare4B==false) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare4B==true) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;
                case ("f"):
                    if (compare4C==false) {
                        System.out.println("Correct.");
                    } //end of nested if
                    else if (compare4C==true) {
                        System.out.println("Incorrect.");
                    } //end of nested else-if
                    else {
                        System.out.println("You did not enter a proper letter.");
                    } //end of nested else
                    break;    
                default:
                    System.out.println("You did not enter a proper letter.");
                    break;
                    
            } //end of fourth nested switch    
            
    } //end of overarching switch
    
    } //end of method
    
} //end of class