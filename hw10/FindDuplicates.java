//////////////////////////////
//Jake Paytas
//CSE2
//November 17, 2014
//Hw10 Part I: Find Duplicates Java program

import java.util.Scanner;


public class FindDuplicates{
    
  public static void main(String [] arg){
      
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}" 
      
      if(hasDups(num)){  //if this is true, hence created programs must be boolean
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);
      
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int num[]){
      int match = 0;
      int i;
      int k;
      
      for (i=0; i<10; i++){ //scans the array
          for (k=0; k<10; k++){ //also scans the array
              if (num[i]==num[k]){ //if we get a winner
                  match++;
              }//end of if
          }//end of k for
      }//end of i for
      
      if (match>= 12){ //"match" scans length, and will always output 10 if no duplicates are entered. For every duplicate, match adds 2 to its result
          return true;
      }
      else{ //if not
          return false;
      }
      
  }//end of hasDups method
  
  public static boolean exactlyOneDup(int num[]){
      int match = 0;
      for (int i=0; i<10; i++){
          for (int k=0; k<10; k++){
              if (num[i]==num[k]){ //if we get a winner
                  match++;
              }//end of if
          }//end of k for
      }//end of i for
      
      if (match==12){ //again, match scans length, but if there is one duplicate, it will add an extra 2 to its result
          return true;
      }
      else{ //if not
          return false;
      }
      
      
  }//end of exactlyOneDup method

}//end of class