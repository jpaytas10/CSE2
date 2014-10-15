/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
    
  public static void main(String arg []){
      
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      System.out.println("You did not enter an int.");
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 25: System.out.println("sum is 25");
      default:
        int n=scan.nextInt();
        System.out.println("Again, you entered "+n);
    }
  }
}

/* Error report:
 *   Explain the error(s) that occurred here, and then fix them
 *   Changed first else statement to alert user if they do not enter an integer.
 *   Deleted "case 24" to prevent fallthrough
 *   Initialized 'n' in the switch statement
 */
