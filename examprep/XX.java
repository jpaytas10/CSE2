
import java.util.Scanner;

public class XX{
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int input = myScanner.nextInt();
        
        for(input = 0; input<=5; input++){
            System.out.print(+input);
        }
        
        
    }
}