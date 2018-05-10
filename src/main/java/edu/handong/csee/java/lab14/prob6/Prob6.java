package edu.handong.csee.java.lab14.prob6;		//package name
import java.util.Scanner;						//using scanner

public class Prob6 {							//create prob6 class. this class can be main method 

	public static void main(String[] args) {	//call the main method
		String name;							//declare the string type name variable
		String race;							//declare the string type race variable
		int age = 0;							//declare the integer type age variable
		Scanner keyboard = new Scanner(System.in);				//using keyboard scanner
		CustomID obj = new CustomID();			//instantiate the CustomID
		boolean repeat = true;					//declare the boolean type repeat variable. and assign true.

		while(repeat) {							//Loop
			try {								//find the exception process
				if(obj.getState() == 0) {		//if state is 0
					System.out.print("Enter your name: ");		//print the following sentence.
					name = keyboard.nextLine();				//assign the name is input string value
					obj.set_name(name);						//call set_name method.
				}
				else if(obj.getState() == 1) {				//if state is 1
					System.out.print("Enter your age: ");	//print the following sentence.
					age = keyboard.nextInt();				//assign the age is input integer value.
					keyboard.nextLine();					//erase the space
					obj.set_age(age);						//call set_age method.
				}
				else if (obj.getState() == 2) {			//if state is 2
					System.out.print("Enter your race: "); 	//print the following sentence.
					race = keyboard.nextLine();				//assign the race is input string value.
					obj.set_race(race);						//call set_race method.
				}
			}catch(Exception e) {							//if exception happened
				System.out.println(e.getMessage());			//print the error message
				continue;									//continue.
			}
		}

	}

}
