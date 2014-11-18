////////////////////////////////////////////
//Jake Paytas
//CSE2
//Lab 11: Array Practice

import java.util.Scanner;

public class Array{
    
    public static void main (String []args){
        
        int [] x0 = new int[10];
        
        System.out.print("Please enter 10 ints, please: ");
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        for(int i=0; i<10; i++){
            x0[i] = myScanner.nextInt();
        }//end of for loop
        
        int highEntry = x0[0];
        int lowEntry  = x0[0];
        
        for (int k=0; k<10; k++){
            if (highEntry<x0[k]){
                highEntry = x0[k];
            }//end of if
        }//end of for
        
        for (int j=0; j<10; j++){
            if (lowEntry>x0[j]){
                lowEntry = x0[j];
            }//end of if
        }//end of for
        
        System.out.println("The lowest entry is: " +lowEntry);
        System.out.println("The highest entry is:" +highEntry);
        
        int sumEntry = 0;
        
        for (int z=0; z<10; z++){
            sumEntry = sumEntry+x0[z];
        }//end of for
        
        System.out.println("The sum of the entries is: " +sumEntry);
        
        int[] x1 = new int[10];
        int c = 0;
        
        for(int a= 9; a>=0; a--){
            x1[c] = x0[a];
            c++;
        }//end of for
        
        for (int b = 0; b<10; b++){
            System.out.println(+x0[b]+ " " +x1[b]);
        }//end of forx
        
        
        
    }//end of main method
}//end of class