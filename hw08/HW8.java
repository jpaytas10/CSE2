//////////////////////////////////////////////////////////////////
//Jake Paytas
//CSE2
//October 28, 2014
//HW08: Driver Program
//Created to practice writing multiple methods and calling them up

import java.util.Scanner;

public class HW8 {
    public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //prompts the user
	input=getInput(scan,"Cc"); //calls up getInput
	
	
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	
	
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }
  
  public static char getInput(Scanner myScanner, String a){
      if (a.length() == 1){
          myScanner = new Scanner (System.in);
          char bigC = a.charAt(0);
          char lilC = a.charAt(1);
          
          String input = myScanner.nextLine();
          char check = input.charAt(0); //assigning the first letter of the user input to a variable
          
          if (input.length() == 1){ //makes sure the user inputted only one character
              if (bigC == check){
                  return bigC; //"spit out" C
              }//end of first nested if
              else if (lilC == check){
                  return lilC; //"spit out" c
              }//end of second nested if
              else {
            System.out.println("You did not input either 'C' or 'c'. ");
            return ' ';
        }//end of nested else
          }//end of if
      }//end of overarching if
      else{
              System.out.println("Bad input. Input only one character, either 'C' or 'c'. ");
              return getInput(myScanner, a);
          }//end of else
          return getInput(myScanner, a);
  }//end of method
  
  public static char getInput(Scanner myScanner, String b, int limit){
    for (int counter = 0; counter<limit; counter++){
        
        myScanner = new Scanner(System.in);
        String input = myScanner.nextLine(); //take in user input
        
        char bigY = b.charAt(0); //first letter of definied "YyNn" string
        char lilY = b.charAt(1); //second letter of definied "YyNn" string
        char bigN = b.charAt(2); //third letter of definied "YyNn" string
        char lilN = b.charAt(3); //fourth letter of definied "YyNn" string
        
        char yayOrNay = input.charAt(0); //first letter of user response
        
        if (input.length() == 1){
            if (yayOrNay == bigY){
                return bigY;
            }
            else if (yayOrNay == lilY){
                return lilY;
            }
            else if (yayOrNay == bigN){
                return bigN;
            }
            else if (yayOrNay == lilN){
                return lilN;
            }
            else{
                System.out.println("Bad input. Input 'Y', 'y', 'N', or 'n'. ");
            }//end of else
            
        }//end of if
        else{
            System.out.println("You did not enter only one character. ");
            return getInput(myScanner, b);
        }//end of else
        
    }//end of for loop
    System.out.println("You failed five tries?!?");
    return ' ';
    
  }//end of method 2

public static char getInput(Scanner myScanner, String c, String d){
    
    System.out.print("Enter a digit between 0 and 9: ");
    
    myScanner = new Scanner(System.in);
    String input = myScanner.nextLine();
    
    char zero = d.charAt(0);
    char one = d.charAt(1);
    char two= d.charAt(2);
    char three = d.charAt(3);
    char four = d.charAt(4);
    char five = d.charAt(5);
    char six = d.charAt(6);
    char seven=d.charAt(7);
    char eight =d.charAt(8);
    char nine = d.charAt(9);
    
    char selection = input.charAt(0); //what did the user input
    
    if (input.length() == 1){ //if the length of the user input is one
        if (selection == zero){
                return zero;
        }
        else if (selection == one){
            return one;
        }
        else if (selection == two){
            return two;
        }
        else if (selection ==three){
            return three;
        }
        else if (selection == four){
            return four;
        }
        else if (selection ==five ){
            return five;
        }
        else if (selection == six){
            return six;
        }
        else if (selection ==seven ){
            return seven;
        }
        else if (selection == eight){
            return eight;
        }
        else if (selection == nine){
            return nine;
        }
        else{
            System.out.println("Bad input. Please enter 0, 1, 2, 3, 4, 5, 6, 7, 8, or 9. ");
            return getInput(myScanner, c, d);

        }//end of else

        //end of switch
    }//end of big if
    else {
        System.out.println("You did not enter only one character.");
        return getInput(myScanner, c, d);
    }//end of else
    
}//end of method
    
    
}//end of class