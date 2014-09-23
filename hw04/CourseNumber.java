//////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 22, 2014
//CSE2
//Hw04 Pt. III
//Course Number Program
//Created to indicate what year and what semester a course at Lehigh was offered.
//
//  first compile the program
//      javac CourseNumber.java
//  then run the program
//      java CourseNumber

    import java.util.Scanner;
    
//define the class
public class CourseNumber {
    
    //define the method
    public static void main(String [] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the six digit course number: ");
        int courseNumber = myScanner.nextInt();
        int nYear = (courseNumber / 100);
        int nSemester = ((int)(courseNumber - (nYear*100)));
        
        if (courseNumber<= 186510 || courseNumber >= 201440) {
            System.out.println("You did not enter an integer within the range [186510 , 201440].");
        } //end of first if statement
        
        else if (nSemester == 10) {
            System.out.println("The course was offered in the SPRING semester of "+nYear+ ".");
        } //end of second if statement
        
        else if (nSemester == 20) {
            System.out.println("The course was offered in the SUMMER 1 semester of "+nYear+ ".");
        } //end of third if statement
        
        else if (nSemester == 30) {
            System.out.println("The course was offered in the SUMMER 2 semester of "+nYear+ ".");
        } //end of fourth if statement
        
        else if (nSemester == 40) {
            System.out.println("The course was offered in the FALL semester of "+nYear+ ".");
        } //end of fifth if statement
        
        else {
            System.out.println("You did not enter a legitamate semester.");
            return; //terminates program
        } //end of else statement

    } //end of method
    
} //end of class