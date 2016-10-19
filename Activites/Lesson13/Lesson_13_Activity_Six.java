/*
 * Lesson 13 Coding Activity 6 
 * We are going to redo the last coding activity from Lesson 12,
 * but this time it will also print out a message if the temperature is OK.
 * 
 * You are running an experiment that involves hatching chicken eggs.
 * Bird eggs are very sensitive to temperature and chickens' eggs will hatch between 99 and 102 degrees Fahrenheit.
 *
 * Write the code for the sensor that will be tracking the temperature. 
 * If the temperature falls below 99 or above 102 your code should print ÒWARNINGÓ otherwise ÒTemperature is OKÓ.
 * The values 99 and 102 are considered to be included in the ok range and the input will be in doubles.
 *
 * 
 *     Sample Run 1
 *         What is the temperature?
 *         45.3
 *         WARNING
 *
 *         
 *      Sample Run 2
 *         What is the temperature?
 *         100    
 *         Temperature is OK
 * 
 */


import java.util.Scanner;

public class Lesson_13_Activity_Six {
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	
      // Input number for temperature
    	System.out.println("Input the temperature");
    	double d = scan.nextDouble();
    	
      // Check to see if the temperature is over 102 degrees, then check to see if the temperature if below 99
      // If the temperature passes both checks, we then print that the temperature is OK
    	if(d > 102)
    		System.out.println("WARNING");
    	else if(d < 99)
    		System.out.println("WARNING");
    	else
    		System.out.println("Temperature is OK");
    	
    	scan.close();
    }
}
