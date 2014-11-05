/////////////////////////////////////
//Jake Paytas
//CSE2
//November 4, 2014
//HW09: Blocked Again Java Program
//Created to help developers use nested methods to solve problems by dividing them into subproblems

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }


public static int getInt(){
    System.out.print("Enter an integer within the range 1-9: ");
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    int userInput = checkInt(myScanner);
    int userRange = checkRange(userInput);
    
    return userRange; //if the number is indeed an integer within the range
 
}//end of getInt method
    
        public static int checkInt(Scanner myScanner){
            int badEntry = 0;
            if (myScanner.hasNextInt()){
                int userInputGood = myScanner.nextInt();
                return userInputGood;
            }//end of if statement
            else {
                System.out.println("You did not enter an integer.");
                return badEntry;
            }
            
        }//end of checkInt method
        
        public static int checkRange(int userInputGood){
            int badEntry = 0;
            if (userInputGood >= 1 && userInputGood <= 9){
                int userInputPerfect = userInputGood;
                return userInputPerfect;
            }//end of if statement
            else {
                System.out.println("You did not enter an integer in the correct range.");
                return badEntry;
            }
        }//end of checkRange method
        
public static void allBlocks(int x){
    block(x);
}//end of allBlocks method

public static void block(int x1){
    int m;
    int lineNo;
    int space;
    int counter;
    int var;
    
    for (lineNo=1; 1<x1+1; lineNo++){
        for (m=0; m<lineNo; m++){
            for (space=x1; space>1; space--){
                
                System.out.println(" "); //entering spaces
                
            }//end of inner for
            
            for(counter=0; counter<(lineNo-1); counter++){
                
                System.out.print(lineNo + "" +lineNo);
                
            }//end of second inner for
            
            System.out.println(+lineNo);
            
        }//end of middle for
        for (var=x1; var>lineNo; var--){
            System.out.print(" ");
        }//end of second middle for
        
        line(lineNo); //moves to the line method
        
    }//end of overarching for
}//end of block method

public static void line(int lineNo){
    int dashNo;
    
    for (dashNo=0; dashNo<(lineNo-1); dashNo++){
        System.out.print("--");
    }
    
    System.out.print("-");
    
}//end of line method

}//end of class
