/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
          System.out.println("k at line 19:"+k);
          System.out.println("n at line 20:"+n);
    }
    if(n*k%12< 12){
      n-=20;
      System.out.println("k at line 24:"+k);
      System.out.println("n at line 25:"+n);
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println("k at line 31:"+k);
      System.out.println("n at line 32:"+n);
    }
    else {
      n=45;
      out+=n+k;
      System.out.println("k at line 37:"+k);
      System.out.println("n at line 38:"+n);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        System.out.println("k at line 44:"+k);
        System.out.println("n at line 45:"+n);
        break;
      case 97:
        n-=14;
        k-=2;
        System.out.println("k at line 50:"+k);
        System.out.println("n at line 51:"+n);
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println("k at line 56:"+k);
        System.out.println("n at line 57:"+n);
      default:
        n-=3;
        k =5; //this is the point of error
        System.out.println("k at line 61:"+k);
        System.out.println("n at line 62:"+n);
    }
     out+=1/n + 1/k;
     System.out.println("k at line 65:"+k);
     System.out.println("n at line 66:"+n);
    System.out.println(out);
  }
}

/*
 * Error report:
 * Using System.out.println(); statements allows us to "check in" on the progress of a program.
 * I inserted print statements along every different stage of the program.
 * k became 0 at line 60, causing a runtime error identified by the java.lang function.
 * I changed line 60 to allow the program to run to the end without errors.
 */
