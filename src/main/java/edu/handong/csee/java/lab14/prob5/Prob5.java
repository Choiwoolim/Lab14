package edu.handong.csee.java.lab14.prob5;			//package name
import java.util.Scanner;							//using scanner

public class Prob5 {								//Class name is prob5 and it can be main class
	public static void main(String[] a) {			//call main method
		try {										//find the exception process
			Scanner keyboard = new Scanner(System.in);		//using keyboard scanner.
			String str = keyboard.nextLine();				//declare the string type str variable. and assign the input string
			Prob5.myTest(str);								//call myTest method.
		} catch(MyException mae) {							//if exception happened
			System.out.println("Inside catch block: " + mae);	//print the following setence.
		}
	}
	
	static void myTest(String str) throws MyException{			//call myTest method
		if(str.equals("null")){								//string is null
			throw new MyException("String val is null");	//store the new exception
		}
		else												//else condition
			System.out.println("String val is: " + str);	//print the following setence.
	}

}
