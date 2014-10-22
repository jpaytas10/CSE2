/////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//CSE2
//October 20, 2014
//Hw07 : Number Stack Java Program
//This program is created to practice the use of while, for, and do-while loops.

import java.util.Scanner;

//first define the class
public class NumberStack {
    
    //then define the method
    public static void main (String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Please enter a positive integer from 1 to 9: ");
        
        
        if (myScanner.hasNextInt()){
            
            int input = myScanner.nextInt();
            
            if ( (input >= 1) && (input <= 9)){
                
                int var, var1, var2, var3, var4;
                
                System.out.println("Using for loops: ");
                
                for (var=1; var<=input; var++){
                    for (var1=1; var1<=var; var1++){
                        for (var2=1; var2<=var1; var2++){
                            
                            System.out.print(" ");//provides spacing
                            
                        }//end of nested for loop
                        for (var3=1; var3<=(2*(var))-1; var3++){ //the "2*" provides the pyramid shape
                            
                            System.out.print(+var);
                            
                        }//end of nested for loop
                        System.out.println();//return
                        
                        
                        for (var4=1; var4<=(2*(var))-1; var4++){ //the "2*" provides the pyramid shape
                            
                            System.out.print("-");
                            
                        }//end of nested for loop
                        System.out.println();//return
                        
                    }//end of nested for loop
                }//end of overarching for loop
                
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
                
                System.out.println("Using while loops: ");
                
                int var5, var6, var7, var8, var9;//reinitializing the variables
                var5 = 1;
                while (var5<=input){
                    var6 = 1;
                    while (var6<=var5){
                        var7 = 1;
                        while (var7<=input){
                            
                            System.out.print(" ");//provides spacing
                            var7++; //ticks up the counter
                            
                        }//end of nested while
                        var8 = 1;
                        while (var8<=(2*(var5))-1){ //the "2*" provides the pyramid shape
                            
                            System.out.print(+var5);
                            var8++; //ticks up the counter
                            
                        }//end of nested while
                        System.out.println(); //returns
                    var6++; //ticks up the counter
                    
                    }//end of nested while
                    var9 = 1;
                    while (var9<=(2*(input))-1){
                        
                        System.out.print("-");
                        var9++;
                        
                    }//end of nested loop
                    System.out.println(); //returns
                    var5++; //ticks up the counter
                    
                }//end of while loop
                
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
                
                System.out.println("Using do loops: ");
                
                int var10, var11, var12, var13, var14;

            }//end of nested if
            else {
                System.out.println("Bad input.");
                return;
            }//end of nested else
        }//end of if
        else {
            System.out.println("Bad input.");
            return;
        }//end of overarching else
        
    }//end of method
    
}//end of class