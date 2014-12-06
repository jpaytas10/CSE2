///////////////////////////////////////////
//Jake Paytas
//CSE2
//December 1, 2014
//Homework 11 Pt. I: Poker Hands Java Program
//Created to practice use with multidimensional arrays

import java.util.Scanner;


public class PokerHands{
    
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
            
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ");
        String goAgain = "";
        goAgain = myScanner.next();
        
        if (goAgain.equals("y") || goAgain.equals("Y")){
        
        while (goAgain.equals("Y") || goAgain.equals("y")){
            
            if (goAgain.equals("y") || goAgain.equals("Y")){
                
                int suits[] = new int [5];
                int ranks[] = new int [5];
                
                for (int i = 0; i<suits.length; i++){ //for loop to fill the suit and rank arrays
                    System.out.print("Enter the suit ('c', 'd', 'h', or 's'): ");
                    String response = "";
                    response = myScanner.next();
                    
                    if (response.equals("c")){
                        suits[i] = 1;
                    }
                    else if (response.equals("d")){
                        suits [i] = 2;
                    }
                    else if (response.equals("h")){
                        suits [i] = 3;
                    }
                    else if (response.equals("s")){
                        suits [i] = 4;
                    }
                    else {
                        System.out.print("You did not enter a correct suit.");
                        return;
                    }
                
                    System.out.print("Enter the rank ('a', 'k', 'q', 'j', '10', ... '3', '2'): ");
                    String response2 = "";
                    response2 = myScanner.next();
                    
                    if (response2.equals("a")){
                        ranks[i] = 14;
                    }
                    else if (response2.equals("k")){
                        ranks[i] = 13;
                    }
                    else if (response2.equals("q")){
                        ranks[i] = 12;
                    }
                    else if (response2.equals("j")){
                        ranks[i] = 11;
                    }
                    else if (response2.equals("10")){
                        ranks[i] = 10;
                    }
                    else if (response2.equals("9")){
                        ranks[i] = 9;
                    }
                    else if (response2.equals("8")){
                        ranks[i] = 8;
                    }
                    else if (response2.equals("7")){
                        ranks[i] = 7;
                    }
                    else if (response2.equals("6")){
                        ranks[i] = 6;
                    }
                    else if (response2.equals("5")){
                        ranks[i] = 5;
                    }
                    else if (response2.equals("4")){
                        ranks[i] = 4;
                    }
                    else if (response2.equals("3")){
                        ranks[i] = 3;
                    }
                    else if (response2.equals("2")){
                        ranks[i] = 2;
                    }
                    
                    else {
                        System.out.print("You did not enter a correct rank.");
                        return;
                    }
                    
                    }//end of for loop
                    
                
                
             showOneHand(suits, ranks); //call the show method
             getRank(suits, ranks);
            
            }
        
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ");
            goAgain = myScanner.next();    
        
    }//end of while
}//end of overarching if
else {
    System.out.println("Goodbye.");
    return;
}
   
    
}//end of main method
    
    public static void showOneHand(int suits[], int ranks[]){
	    
	    String clubs = " ";
	    String diamonds = " ";
	    String hearts = " ";
	    String spades = " ";
	    
	    for (int i = 0; i<suits.length; i++){
	        
	        if (suits[i]==1){ //if clubs
	            if (ranks[i]==14){
	                clubs+= "A ";
	            }
	            else if (ranks[i]==13){
	                clubs += "K ";
	            }
	            else if (ranks[i]==12){
	                clubs += "Q ";
	            }
	            else if (ranks[i]==11){
	                clubs += "J ";
	            }
	            else if (ranks[i]==10){
	                clubs += "10 ";
	            }
	            else if (ranks[i]==9){
	                clubs += "9 ";
	            }
	            else if (ranks[i]==8){
	                clubs += "8 ";
	            }
	            else if (ranks[i]==7){
	                clubs += "7 ";
	            }
	            else if (ranks[i]==6){
	                clubs += "6 ";
	            }
	            else if (ranks[i]==5){
	                clubs += "5 ";
	            }
	            else if (ranks[i]==4){
	                clubs += "4 ";
	            }
	            else if (ranks[i]==3){
	                clubs += "3 ";
	            }
	            else if (ranks[i]==2){
	                clubs += "2 ";
	            }
	            
	        }//end of clubs if
	        else if (suits[i]==2){ //if diamonds
	            if (ranks[i]==14){
	                diamonds+= "A ";
	            }
	            else if (ranks[i]==13){
	                diamonds += "K ";
	            }
	            else if (ranks[i]==12){
	                diamonds += "Q ";
	            }
	            else if (ranks[i]==11){
	                diamonds += "J ";
	            }
	            else if (ranks[i]==10){
	                diamonds += "10 ";
	            }
	            else if (ranks[i]==9){
	                diamonds += "9 ";
	            }
	            else if (ranks[i]==8){
	                diamonds += "8 ";
	            }
	            else if (ranks[i]==7){
	                diamonds += "7 ";
	            }
	            else if (ranks[i]==6){
	                diamonds += "6 ";
	            }
	            else if (ranks[i]==5){
	                diamonds += "5 ";
	            }
	            else if (ranks[i]==4){
	                diamonds += "4 ";
	            }
	            else if (ranks[i]==3){
	                diamonds += "3 ";
	            }
	            else if (ranks[i]==2){
	                diamonds += "2 ";
	            }
	        }
	       else if (suits[i]==3){ //if hearts
	            if (ranks[i]==14){
	                hearts+= "A ";
	            }
	            else if (ranks[i]==13){
	                hearts += "K ";
	            }
	            else if (ranks[i]==12){
	                hearts += "Q ";
	            }
	            else if (ranks[i]==11){
	                hearts += "J ";
	            }
	            else if (ranks[i]==10){
	                hearts += "10 ";
	            }
	            else if (ranks[i]==9){
	                hearts += "9 ";
	            }
	            else if (ranks[i]==8){
	                hearts += "8 ";
	            }
	            else if (ranks[i]==7){
	                hearts += "7 ";
	            }
	            else if (ranks[i]==6){
	                hearts += "6 ";
	            }
	            else if (ranks[i]==5){
	                hearts += "5 ";
	            }
	            else if (ranks[i]==4){
	                hearts += "4 ";
	            }
	            else if (ranks[i]==3){
	                hearts += "3 ";
	            }
	            else if (ranks[i]==2){
	                hearts += "2 ";
	            }
	        }
	        else if (suits[i]==4){ //if spades
	            if (ranks[i]==14){
	                spades+= "A ";
	            }
	            else if (ranks[i]==13){
	                spades += "K ";
	            }
	            else if (ranks[i]==12){
	                spades += "Q ";
	            }
	            else if (ranks[i]==11){
	                spades += "J ";
	            }
	            else if (ranks[i]==10){
	                spades += "10 ";
	            }
	            else if (ranks[i]==9){
	                spades += "9 ";
	            }
	            else if (ranks[i]==8){
	                spades += "8 ";
	            }
	            else if (ranks[i]==7){
	                spades += "7 ";
	            }
	            else if (ranks[i]==6){
	                spades += "6 ";
	            }
	            else if (ranks[i]==5){
	                spades += "5 ";
	            }
	            else if (ranks[i]==4){
	                spades += "4 ";
	            }
	            else if (ranks[i]==3){
	                spades += "3 ";
	            }
	            else if (ranks[i]==2){
	                spades += "2 ";
	            }
	        }
	        
	            
	        
	        
	    
  }//end of for loop
  
    System.out.println("CLubs: " +clubs);
    System.out.println("Diamonds: " +diamonds);
	System.out.println("Hearts: " +hearts);
	System.out.println("Spades: " +spades);

        
    } //end of showOneHand method 
    
    public static void getRank(int suits[], int ranks[]){
        
        int onePair = 0;
        int twoPair = 0;
        int flush = 0;
        int royalFlush = 0;
        int straight = 0;
        int straightFlush = 0;
        int highCard = 0;
        int fourOfAKind = 0;
        int fullHouse = 0;
        
        
        for (int i = 0; i<suits.length; i++){
            for (int j = 0; j<suits.length; j++){
                
                if (suits[i]==suits[j] && ranks[j]>=10){
                    royalFlush++;
                }
                else if ((suits[i]==suits[j]) && (ranks[j]-ranks[j-1]==1)){
                    straightFlush++;
                }
                else if (ranks[j] == ranks[i]){
                    fourOfAKind++;
                    onePair++;
                    twoPair++;
                }
                else if ((ranks [j] == ranks[j+1] && ranks[j+1] == ranks[j+2]) && (ranks[i] == ranks[i+1])){
                    fullHouse++;
                }
                else if (suits[j] == suits [i]){
                    flush++;
                }
                else if ((ranks[j]-ranks[j-1])==1){
                    straight++;
                }
                else{
                    highCard++;
                }
        }
    }
      
            if (royalFlush==1){
                System.out.println ("You have a Royal Flush!");
            }
            else if (straightFlush==1){
                System.out.println ("You have a Straight Flush!");
            }
            else if (fourOfAKind==4){
                System.out.println ("You have Four of a Kind!");
            }
            else if (fullHouse==1){
                System.out.println ("You have a Full House!");
            }
            else if (flush==1){
                System.out.println ("You have a Flush!");
            }
            else if (straight==1){
                System.out.println ("You have a Straight!");
            }
            else if (twoPair==2){
                System.out.println ("You have a Two Pairs!");
            }
            else if (onePair==1){
                System.out.println ("You have a pair!");
            }
            else if (highCard==1){
                System.out.println ("You have a high card hand.");
            }
            
    }//end of getRank method
            
}//end of class