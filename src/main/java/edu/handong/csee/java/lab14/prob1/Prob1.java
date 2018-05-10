package edu.handong.csee.java.lab14.prob1;			//Package name
import java.util.Scanner;							//Using Scanner
import java.util.Random;							//Using Random function

public class Prob1 {								//main Class name is Prob1

	public static void main(String[] args) {			//Call main method
		
		Scanner keyboard = new Scanner(System.in);		//Call Scanner
		Random rand = new Random();						//Declare the random function
		int limit = 0;									//Declare the integer variable limit
		int speed = 0;									//Declare the integer variable speed
		
		System.out.println("Set the speed limit, officer : ");		//Print the following sentence
		limit = keyboard.nextInt();						//limit is input value.
		speed = rand.nextInt(101);						//speed is random value.
		
		SpeedLimitter lim = new SpeedLimitter(limit, speed);	//Instantiate the Speedlimitter and assign limit and speed.
		
		lim.warnSpeedLimit();							//Call warnSpeedLimit method
		
		keyboard.close();								//close Scanner

	}

}
