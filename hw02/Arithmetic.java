//////////////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//Homework Assignment 2
//September 8, 2014
//Arithmetic Calculator Java Program
//Designed to help carry out calculations when shopping, including total price and added sales tax
//
//  first compile the program
//      javac Arithmetic.java
//  then run the program
//      java Arithmetic//

//  define the class
public class Arithmetic{
    
    //define the main method
    public static void main(String [] args) {
        //define input variables
        
                //Number of pairs of socks
                int nSocks=3;
                //Cost per pair of socks
                //"$" is part of the varible name
                double sockCost$=2.58;
            
                //Number of drinking glasses
                int nGlasses=6;
                //Cost per glass
                double glassCost$=2.29;
            
                //Number of boxes of envelopes
                int nEnvelopes=1;
                //Cost per box of envelopes
                double envelopeCost$=3.25;
                //Percent tax
                double taxPercent=0.06;
                
            //perform calculations for cost before tax & print results
            System.out.println("Socks cost you $"+ (nSocks*sockCost$)+ " before tax.");
            System.out.println("Drinking glasses cost you $"+ (nGlasses*glassCost$)+ " before tax.");
            System.out.println("Envelopes cost you $"+ (nEnvelopes*envelopeCost$)+ " before tax.");
            
                //define variables for total cost before tax
                double totalCostSocksBT$=nSocks*sockCost$;
                double totalCostGlassesBT$=nGlasses*glassCost$;
                double totalCostEnvelopesBT$=nEnvelopes*envelopeCost$;
            
            //perform calculations for amount of tax & print results
            System.out.println("You pay $"+ (totalCostSocksBT$*taxPercent)+ " of tax on socks.");
            System.out.println("You pay $"+ (totalCostGlassesBT$*taxPercent)+ " of tax on drinking glasses.");
            System.out.println("You pay $"+ (totalCostEnvelopesBT$*taxPercent)+ " of tax on envelopes.");
            
            //perform calculations for total price of purchase before tax
            System.out.println("The total price of this purchase is $"+ (totalCostSocksBT$+totalCostGlassesBT$+totalCostEnvelopesBT$)+ "BEFORE tax.");
                
            //define variables for total cost after tax
                double totalCostSocks$=((totalCostSocksBT$)+(totalCostSocksBT$*taxPercent));
                double totalCostGlasses$=((totalCostGlassesBT$)+(totalCostGlassesBT$*taxPercent));
                double totalCostEnvelopes$=((totalCostEnvelopesBT$)+(totalCostEnvelopesBT$*taxPercent));
                
                //perform calculations for total cost & print results
            System.out.println("Socks cost youa total of $"+ totalCostSocks$+ " after tax.");
            System.out.println("Drinking Glasses cost you a total of $"+ totalCostGlasses$+ " after tax.");
            System.out.println("Envelopes cost you a total of $"+ totalCostEnvelopes$+ " after tax.");
                
            //perform calculations for total price of purchase after tax
            System.out.println("THE TOTAL PRICE OF THIS PURCHASE IS $"+ (totalCostSocks$+totalCostGlasses$+totalCostEnvelopes$)+ " AFTER tax.");
            
            
    } //end of main method
    
} //end of class