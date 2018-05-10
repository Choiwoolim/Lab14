package edu.handong.csee.java.lab14.prob4;			//package name
import java.util.Scanner;							//using scanner

public class Prob4 {								//main class name is prob4
	public static void main(String[] args) {		//call main method
		Scanner keyboard = new Scanner(System.in);	//Declare the keyboard scanner.
		int num = 0;								//declare the integer variable num.
		Boundary arr = new Boundary();				//instantiate the boundary class.
		boolean repeat = true;						//declare the boolean type variable and assign true.
		while(repeat) {								//Loop
			try {									//find the exception process
				System.out.print("Enter an integer: ");		//print the following sentence.
				num = keyboard.nextInt();			// assign num is input value.
				arr.receive(num);					//call receive method.
			}catch(ArrayIndexOutOfBoundsException e){	//if exception is happen
				System.out.println("Invalid array index access!");	//print the following sentence.
				repeat = false;						//boolea repeat is false.(exit the loop)

			}
		}

	}
}