/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//Homework 01
//'Welcome' Java Program
//
//  first compile the program
//      javac WelcomeClass.java
//  then, run the program
//      java WelcomeClass//

//  define class
public class WelcomeClass{
    
//  add main method
  public static void main(String[] args) {
      
///snippet 2
float val1 = 3.0f;
float val2 = 7.4f;

if ( val1 > val2 ){
    float val3 = 4.4f;
    if ( val3 < val2 ) {
        System.out.println("sum1: " + (val1 + val2) );
    }
    else{
        System.out.println("sum2: " +  val1 + val2  );
    }
}
else{
    float val3 = 2.2f;
    if ( val3 < val2 ) {
        System.out.println("sum3: " +  val1 + val2  );
    }
    else{
        System.out.println("sum4: " + (val1 + val2) );
    }
}

    
    //test/testtest
  }
}