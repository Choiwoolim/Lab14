package edu.handong.csee.java.lab14.prob2;			//Package name.
import java.util.InputMismatchException;			//Using InputMismatchException.
import java.util.Scanner;							//Using scanner.

public class Inexception {							//Class name is Inexception
	private int x = 0;								//Declare the private integer variable x
	private int y = 0;								//Declare the private integer variable y

	public Inexception() {							//Instantiate the exception class.
	}

	public void error_det() {						//Create the public void type eroor_det
		try {										//Find the exception process.
			Scanner keyboard = new Scanner(System.in);	//Declare the keyboard scanner.		
			System.out.print("x: ");					//print the following letter
			x = keyboard.nextInt();						//assign x is input value.
			System.out.print("y: ");					//print the y
			y = keyboard.nextInt();						//assign y is input value.
			System.out.println(this.x / this.y);		//print x/y
		}
		catch(ArithmeticException e) {					//Find the exception
			System.out.println("java.Lang.ArithmeticException: " + e.getMessage());		//print the error message
		}
		catch(InputMismatchException e) {				//find the other exception
			System.out.println("java.utilInputMismatchException");			//print the following sentence.
		}
		catch(Exception e) {							//find the another exception
			System.out.println("Some other exception has occured: " + e.getMessage());	//print the following error message.
		}
	}


}
