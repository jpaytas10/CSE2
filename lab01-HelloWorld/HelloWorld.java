/////////////////////////////////////////////////////////////
//Jake Paytas
//Demo 0
//Hello World Java Program
//
//  first compile the program
//      javac HelloWorld.java
//  run the program
//      java HelloWorld//

//  define a class
public class HelloWorld{
    
//  add main method
  public static void main(String[] args) {
      
//  print out the statement with a box around it
double z = 3.0, y = 2.4;
int x = 2;

z = x + y;
x = z;
z -= x + y;
x+= z;
x += y;

System.out.println(""+(x));
    //test/testtest
  }
}