////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 30, 2014
//CSE2
//HW 05
//Burger King Java Program
//Created to inquire about custom user meal orders, complete with details/specifics.

//  first compile the program
//      javac BurgerKing.java
//  then run the program
//      java BurgerKing

    import java.util.Scanner;
    
//define the class
public class BurgerKing {
    
    //define the method
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter a letter to indicate your choice of:\n     Burger (B or b)\n     Soda (S or s)\n     Fries (F or f)\n");
        String order = myScanner.next();
        
        switch (order) {
            case ("B"):
                System.out.print("Enter a letter to indicate your choice of:\n     All the fixins (A or a)\n     Cheese (C or c)\n     None of the above (N or n)\n");
                String burgerTopping = myScanner.next();
                    switch (burgerTopping) {
                        case ("A"):
                            System.out.println("You ordered a burger with all the fixins.");
                            break;
                        case ("a"):
                            System.out.println("You ordered a burger with all the fixins.");
                            break;
                        case ("C"):
                            System.out.println("You ordered a burger with cheese.");
                            break;
                        case ("c"):
                            System.out.println("You ordered a burger with cheese.");
                            break;
                        case ("N"):
                            System.out.println("You ordered a burger with nothing on it.");
                            break;
                        default:
                            System.out.println("You did not enter a proper letter.");
                            break;
                    } //end of "B" Burger switch statement
                break;    
            case ("b"):
                System.out.print("Enter a letter to indicate your choice of:\n     All the fixins (A or a)\n     Cheese (C or c)\n     None of the above (N or n)\n");
                String burgerTopping1 = myScanner.next();
                    switch (burgerTopping1) {
                        case ("A"):
                            System.out.println("You ordered a burger with all the fixins.");
                            break;
                        case ("a"):
                            System.out.println("You ordered a burger with all the fixins.");
                            break;
                        case ("C"):
                            System.out.println("You ordered a burger with cheese.");
                            break;
                        case ("c"):
                            System.out.println("You ordered a burger with cheese.");
                            break;
                        case ("N"):
                            System.out.println("You ordered a burger with nothing on it.");
                            break;
                        case ("n"):
                            System.out.println("You ordered a burger with nothing on it.");
                            break;
                        default:
                            System.out.println("You did not enter a proper letter.");
                            break;
                    } //end of "b" Burger switch statement
                break;    
            case ("S"):
                System.out.print("Enter a letter to indicate your choice of:\n     Coke (C or c)\n     Pepsi (P or p)\n     Sprite (S or s)\n     Mountain Dew (M or m)\n");
                String sodaOrder = myScanner.next();
                    switch (sodaOrder) {
                        case ("C"):
                            System.out.println("You ordered a Coke.");
                            break;
                        case ("c"):
                            System.out.println("You ordered a Coke.");
                            break;
                        case ("P"):
                            System.out.println("You ordered a Pepsi.");
                            break;
                        case ("p"):
                            System.out.println("You ordered a Pepsi.");
                            break;
                        case ("S"):
                            System.out.println("You ordered a Sprite.");
                            break;
                        case ("s"):
                            System.out.println("You ordered a Sprite.");
                            break;
                        case ("M"):
                            System.out.println("You ordered a Mountain Dew.");
                            break;
                        case ("m"):
                            System.out.println("You ordered a Mountain Dew.");
                            break;
                        default:
                            System.out.println("You did not enter a proper letter.");
                            break;
                    } //end of "S" Soda switch statement
                break;    
            case ("s"):
                System.out.print("Enter a letter to indicate your choice of:\n     Coke (C or c)\n     Pepsi (P or p)\n     Sprite (S or s)\n     Mountain Dew (M or m)\n");
                String sodaOrder1 = myScanner.next();
                    switch (sodaOrder1) {
                        case ("C"):
                            System.out.println("You ordered a Coke.");
                            break;
                        case ("c"):
                            System.out.println("You ordered a Coke.");
                            break;
                        case ("P"):
                            System.out.println("You ordered a Pepsi.");
                            break;
                        case ("p"):
                            System.out.println("You ordered a Pepsi.");
                            break;
                        case ("S"):
                            System.out.println("You ordered a Sprite.");
                            break;
                        case ("s"):
                            System.out.println("You ordered a Sprite.");
                            break;
                        case ("M"):
                            System.out.println("You ordered a Mountain Dew.");
                            break;
                        case ("m"):
                            System.out.println("You ordered a Mountain Dew.");
                            break;
                        default:
                            System.out.println("You did not enter a proper letter.");
                            break;
                    } //end of "s" Soda switch statement
                break;    
            case ("F"):
                System.out.print("Enter a letter to indicate your size choice:\n     Large (L or l)\n     Medium (M or m)\n     Small (S or s)\n");
                String friesSize = myScanner.next();
                    switch (friesSize) {
                        case ("L"):
                            System.out.println("You ordered a Large Fries.");
                            break;
                        case ("l"):
                            System.out.println("You ordered a Large Fries.");
                            break;
                        case ("M"):
                            System.out.println("You ordered a Medium Fries.");
                            break;
                        case ("m"):
                            System.out.println("You ordered a Medium Fries.");
                            break;
                        case ("S"):
                            System.out.println("You ordered a Small Fries.");
                            break;
                        case ("s"):
                            System.out.println("You ordered a Small Fries.");
                            break;
                        default:
                            System.out.println("You did not enter a proper letter.");
                            break;
                    } //end of "F" Fries switch statement
                break;    
            case ("f"):
                System.out.print("Enter a letter to indicate your size choice:\n     Large (L or l)\n     Medium (M or m)\n     Small (S or s)\n");
                String friesSize1 = myScanner.next();
                    switch (friesSize1) {
                        case ("L"):
                            System.out.println("You ordered a Large Fries.");
                            break;
                        case ("l"):
                            System.out.println("You ordered a Large Fries.");
                            break;
                        case ("M"):
                            System.out.println("You ordered a Medium Fries.");
                            break;
                        case ("m"):
                            System.out.println("You ordered a Medium Fries.");
                            break;
                        case ("S"):
                            System.out.println("You ordered a Small Fries.");
                            break;
                        case ("s"):
                            System.out.println("You ordered a Small Fries.");
                            break;
                        default:
                            System.out.println("You did not enter a proper letter.");
                            break;
                    } //end of "f" Fries switch statement
                break;    
            default:
                System.out.println("You did not enter a proper letter.");
                break;
        } //end of overarching switch statement            
    } //end of method
    
} //end of class