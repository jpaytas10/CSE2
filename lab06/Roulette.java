/////////////////////////////////////////////////////////////
//Jake Paytas
//CSE2
//October 14, 2014
//Homework 6 Pt. I: Routlette Simulation
//This program is created to simulate a Roulette casino game, and find out how many times a profit is made given 100 spins of the wheel.

//first compile the program
//      javac Roulette.java
//then run the program
//      java Roulette


//define a class
public class Roulette {
    
    //define a method
    public static void main (String [] args){
        
    int bigCounter = 0;
    int cameUpBig = 0;
    int lostItAll = 0;
    while (bigCounter < 1000) {
        
        int winningNo = ((int)(Math.random()*38)+1);
        
        int counter = 0;
        int nWins   = 0;
        int nLosses = 0;
        while (counter < 100) {
            int wheelSpin = ((int)(Math.random()*38)+1);
            
            if (winningNo==wheelSpin){
                nWins++;
            }
            else{
                nLosses++;
            }
            
            counter++;
            
        }
        
        int totalWinnings = (36*(nWins));
        int totalLosses   = nLosses;
        int profit        = ((totalWinnings)-(totalLosses));
        
        if (profit > 0){
            cameUpBig++;
        }
        else {
            lostItAll++;
        }
        
        bigCounter++;
        
    }
    
    System.out.println("You came up away with a profit " +cameUpBig+ " times.");
    System.out.println("You lost it all " +lostItAll+ " times.");
        
    }
}