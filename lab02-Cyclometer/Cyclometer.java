//////////////////////////////////////////////////////////////////////////////////////
//Jake Paytas
//September 4, 2014
//CSE2
//Lab 02
//Cyclometer Java Program
//Created to document time (seconds) and rotations of front tire during bycicle trips
//
//  first compile the program
//      javac Cyclometer.java
//  then run the program
//      java Cyclometer//

//  define the class
public class Cyclometer{
    
    //main method for Java Programs 
    public static void main(String [] args) {
        //input data
            int secsTrip1=480;      //trip 1 time (seconds)
            int secsTrip2=3320;     //trip 2 time (seconds)
            int countsTrip1=1561;   //trip 1 revolutions (counts)
            int countsTrip2=9037;   //trip 2 revolutions (counts)
            
            double wheelDiameter=27.0,  //constant, Diameter of wheel 
            PI=3.14159,                 //constant, pi
            feetPerMile=5280,           //constant, the number of feet in a mile
            inchesPerFoot=12,           //constant, the number of inches in a foot
            secondsPerMinute=60;        //constant, the number of seconds in a minute
            double distanceTrip1, distanceTrip2, totalDistance; //
            
        //print results
            System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+"minutes and had"+ countsTrip1+" counts.");
            System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+"minutes and had"+ countsTrip2+" counts.");
        
        //run the calculations; store the values. Run your
        //calculations here. What are you calculating?
        //Converting the time in seconds of Trip1 and Trip2 to time in minutes
        //
            distanceTrip1=countsTrip1*wheelDiameter*PI;
            //Above gives distance in inches
            //(for each count, a rotation of the wheel travels
            //the diameter in inches times PI)
            distanceTrip1/=inchesPerFoot*feetPerMile;   //gives distance in miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            
        //print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+ (distanceTrip1+distanceTrip2)+" miles");
            
        
    } //end of main method
    
} //end of class