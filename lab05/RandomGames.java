////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 26, 2014
//CSE2
//Lab 05
//Random Games Java Program
//Created to simulate three seperate "ramdomized games" at the user's selection.

//  first compile the program
//      javac RandomGames.java
//  then run the program
//      java RandomGames

    import java.util.Scanner;
    
// define the class
public class RandomGames {
    
    //define the method
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
    
        System.out.print("Enter the game you'd like to play: (R/r/C/c/P/p) ");
        String selection = myScanner.next();
        
        switch (selection) {
            case ("R"):
            System.out.println("You have selected Roulette. Let's play!");
            int rouletteNo = ((int)(Math.random()*36)+1);
            System.out.println("Roulette: "+(rouletteNo)+ ".");
            break;
            case ("r"):
            System.out.println("You have selected Roulette. Let's play!");
            int rouletteNo1 = ((int)(Math.random()*36)+1);
            System.out.println("Roulette: "+(rouletteNo1)+ ".");
            break;
            case ("C"):
                System.out.println("You have selected Craps. Let's Play!");
                int rollOne = ((int)(Math.random()*6)+1);
                int rollTwo = ((int)(Math.random()*6)+1);
                System.out.println(+(rollOne)+ "+" +(rollTwo)+ "=" +(rollOne+rollTwo)+ ".");
                break;
            case ("c"):
                System.out.println("You have selected Craps. Let's Play!");
                int rollOne1 = ((int)(Math.random()*6)+1);
                int rollTwo1 = ((int)(Math.random()*6)+1);
                System.out.println(+(rollOne1)+ "+" +(rollTwo1)+ "=" +(rollOne1+rollTwo1)+ ".");
                break;
            case ("P"):
                System.out.println("You have selected Pick-a-Card. Let's Play!");
                int card = ((int)(Math.random()*13)+1);
                int suit = ((int)(Math.random()*4)+1);
                    switch (suit) {
                        case (1):
                            System.out.println("Card: " +(card)+ " of hearts.");
                            break;
                        case (2):
                            System.out.println("Card: " +(card)+ " of diamonds.");
                            break;
                        case (3):
                            System.out.println("Card: " +(card)+ " of spades.");
                            break;
                        case (4):
                            System.out.println("Card: " +(card)+ " of clubs.");
                            break;
                    } //end of nested switch 1
                break;
            case ("p"):
                System.out.println("You have selected Pick-a-Card. Let's Play!");
                int card1 = ((int)(Math.random()*13)+1);
                int suit1 = ((int)(Math.random()*4)+1);
                    switch (suit1) {
                        case (1):
                            System.out.println("Card: " +(card1)+ " of hearts.");
                            break;
                        case (2):
                            System.out.println("Card: " +(card1)+ " of diamonds.");
                            break;
                        case (3):
                            System.out.println("Card: " +(card1)+ " of spades.");
                            break;
                        case (4):
                            System.out.println("Card: " +(card1)+ " of clubs.");
                            break;
                    } //end of nested switch 2
                break;
            default:
                System.out.println("You did not enter a proper letter.");
                break;
            
        } //end of switch statement
        
    }//end of method
    
} //end of class