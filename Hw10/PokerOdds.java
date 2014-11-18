//////////////////////////////////////////////
//Jake Paytas
//CSE2
//Hw10 Part II: Poker Odds java program

import java.util.Random;
import java.util.Scanner;


public class PokerOdds{
    
  public static void main(String [] arg){
      
    showHands();
    simulateOdds();
  }//end of main method
  
  public static void showHands(){
      String yayOrNay = "";
      do{
          int[] deck = new int[52]; //allocate space for the deck
          for (int i=0; i<52; i++){
              deck[i] = i; //fills spots with integers 0-51
          }//end of for
          
          Random myRandom;
          myRandom = new Random (); //this randomizes the hand
          
          Scanner myScanner;
          myScanner = new Scanner (System.in);
          
          int[] hand = new int[5]; //allocates space for the hand
          for (int k=0; k<5; k++){
              hand[k] = -1; //assigns -1 to each member of the hand
          }//end of for
          
          //at this point, the deck is {0-51}, and the hand is {-1,-1,-1,-1,-1}
          
          for (int j=0; j<5; j++){
              hand[j] = myRandom.nextInt(deck.length); //draws random cards from the deck
          }//end of for
          
          String suit = "";
          
          //the following variables serve to represent placeholders for each empty spot in each
          //of the suit's arrays. They will "guide" the for loops from place value to place value
          int x0 = 0;
          int x1 = 0;
          int x2 = 0;
          int x3 = 0;
          
          String[] clubs = {" ", " ", " ", " ", " ",};
          String[] diamonds = {" ", " ", " ", " ", " ",};
          String[] hearts = {" ", " ", " ", " ", " ",};
          String[] spades = {" ", " ", " ", " ", " ",};
          
          String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
          
          for (int i=0; i<5; i++){ //do out for each card in the hand
              if ((hand[i]/13) == 0){ //if a club is drawn
                for (int j=0; j<13; j++){ //scans the hand for a match in the rank
                    if ((hand[i]%13) == j){ //if it matches something in the rank
                      //int x0 = 0;
                      clubs[x0] = rank[j]; //assigns the "winning" rank symbol
                      x0++;
                      
                    }//end of nested if
                }//end of for    
              }
              if ((hand[i]/13) ==1){ //if a diamond is drawn
                  for (int j=0; j<13; j++){ //scans the hand for a match in the rank
                    if ((hand[i]%13) == j){ //if it matches something in the rank
                      //int x1 = 0;
                      diamonds[x1] = rank[j]; //assigns the "winning" rank symbol
                      x1++;
                      
                    }//end of nested if
                }//end of for    
              }
              if ((hand[i]/13) ==2){ //if a heart is drawn
                  for (int j=0; j<13; j++){ //scans the hand for a match in the rank
                    if ((hand[i]%13) == j){ //if it matches something in the rank
                      //int x2 = 0;
                      hearts[x2] = rank[j]; //assigns the "winning" rank symbol
                      x2++;
                      
                    }//end of nested if
                }//end of for    
              }
              if ((hand[i]/13) ==3){ //if a spade is drawn
                  for (int j=0; j<13; j++){ //scans the hand for a match in the rank
                    if ((hand[i]%13) == j){ //if it matches something in the rank
                      //int x3 = 0;
                      spades[x3] = rank[j]; //assigns the "winning" rank symbol
                      x3++;
                      
                    }//end of nested if
                }//end of for    
              }
          }
          
          System.out.println("Suit      Cards");
          System.out.println("Clubs:    "+clubs[0]+ " " +clubs[1]+ " " +clubs[2]+ " " +clubs[3]+ " " +clubs[4]);
          System.out.println("Diamonds: "+diamonds[0]+ " " +diamonds[1]+ " " +diamonds[2]+ " " +diamonds[3]+ " " +diamonds[4]);
          System.out.println("Hearts:   "+hearts[0]+ " " +hearts[1]+ " " +hearts[2]+ " " +hearts[3]+ " " +hearts[4]);
          System.out.println("Spades:   "+spades[0]+ " " +spades[1]+ " " +spades[2]+ " " +spades[3]+ " " +spades[4]);
          
          System.out.print("Go again? Enter 'y' or 'Y', anything else to quit: ");
          yayOrNay = myScanner.next();
      }
      while (yayOrNay.equals("Y") || yayOrNay.equals("y"));
  }//end of showHands Method
  
  public static void simulateOdds(){
      
      int[] onePair = new int[13];
      int losers = 0;
      
      for (int z=0; z<=10000; z++){
          int[] deck = new int[52]; //allocate space for the deck
          for (int i=0; i<52; i++){
              deck[i] = i; //fills spots with integers 0-51
          }//end of for
          
          Random myRandom;
          myRandom = new Random (); //this randomizes the hand
          
          Scanner myScanner;
          myScanner = new Scanner (System.in);
          
          int[] hand = new int[5]; //allocates space for the hand
          for (int k=0; k<5; k++){
              hand[k] = -1; //assigns -1 to each member of the hand
          }//end of for
          
          //at this point, the deck is {0-51}, and the hand is {-1,-1,-1,-1,-1}
          
          for (int j=0; j<5; j++){
              hand[j] = myRandom.nextInt(deck.length); //draws random cards from the deck
          }//end of for
          
          String suit = "";
          
          //the following variables serve to represent placeholders for each empty spot in each
          //of the suit's arrays. They will "guide" the for loops from place value to place value
          int x0 = 0;
          int x1 = 0;
          int x2 = 0;
          int x3 = 0;
          
          String[] clubs = {" ", " ", " ", " ", " ",};
          String[] diamonds = {" ", " ", " ", " ", " ",};
          String[] hearts = {" ", " ", " ", " ", " ",};
          String[] spades = {" ", " ", " ", " ", " ",};
          
          String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
          
          for (int i=0; i<5; i++){ //do out for each card in the hand
              if ((hand[i]/13) == 0){ //if a club is drawn
                for (int j=0; j<13; j++){ //scans the hand for a match in the rank
                    if ((hand[i]%13) == j){ //if it matches something in the rank
                      //int x0 = 0;
                      clubs[x0] = rank[j]; //assigns the "winning" rank symbol
                      x0++;
                      
                    }//end of nested if
                }//end of for    
              }
              if ((hand[i]/13) ==1){ //if a diamond is drawn
                  for (int j=0; j<13; j++){ //scans the hand for a match in the rank
                    if ((hand[i]%13) == j){ //if it matches something in the rank
                      //int x1 = 0;
                      diamonds[x1] = rank[j]; //assigns the "winning" rank symbol
                      x1++;
                      
                    }//end of nested if
                }//end of for    
              }
              if ((hand[i]/13) ==2){ //if a heart is drawn
                  for (int j=0; j<13; j++){ //scans the hand for a match in the rank
                    if ((hand[i]%13) == j){ //if it matches something in the rank
                      //int x2 = 0;
                      hearts[x2] = rank[j]; //assigns the "winning" rank symbol
                      x2++;
                      
                    }//end of nested if
                }//end of for    
              }
              if ((hand[i]/13) ==3){ //if a spade is drawn
                  for (int j=0; j<13; j++){ //scans the hand for a match in the rank
                    if ((hand[i]%13) == j){ //if it matches something in the rank
                      //int x3 = 0;
                      spades[x3] = rank[j]; //assigns the "winning" rank symbol
                      x3++;
                      
                    }//end of nested if
                }//end of for    
              }//end of large if
          }//end of 5 for
          
          int search = 0;
          int pair = 0;
      for (int i=0; i<13; i++){
          for (int k=0; k<13; k++){
              if (hand[i]==hand[k]){ //if we get a winner
                  search++;
              }//end of if
          }//end of k for
      }//end of i for
      
      if (search==15){ //search scans length, but if there is one duplicate, it will add an extra 2 to its result
          pair++;
      }
      else{ //if not
          pair = 0;
      }
          
      }//end of 10000 for
      
      
      System.out.println("Rank  Freq of exactly one pair");
      System.out.println("A: "  +onePair[0]);
      System.out.println("K: "  +onePair[1]);
      System.out.println("Q: "  +onePair[2]);
      System.out.println("J: "  +onePair[3]);
      System.out.println("10: " +onePair[4]);
      System.out.println("9: "  +onePair[5]);
      System.out.println("8: "  +onePair[6]);
      System.out.println("7: "  +onePair[7]);
      System.out.println("6: "  +onePair[8]);
      System.out.println("5: "  +onePair[9]);
      System.out.println("4: "  +onePair[10]);
      System.out.println("3: "  +onePair[11]);
      System.out.println("2: "  +onePair[12]);
      System.out.println("----------------------");
      System.out.println("Total not exactly one pair: " +losers);
      
  }//end of simulateOdds method
  
}//end of class
