
import java.util.Scanner;

public class test{
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
    
        int i;
        int temp = 1;
        for(i = 0; i<4; i++){
 //           if (i != 0){
 //           temp = temp*2;
 //           }
            
            for (int j=0; j<i+1; j++){
                //System.out.println(temp);
                for (int k = 0; k<j+1; k++){
                System.out.print(temp);
                
               }
               System.out.println( );
            }
            
            temp = temp*2;
            //System.out.println( temp );
        }
        
    }
}