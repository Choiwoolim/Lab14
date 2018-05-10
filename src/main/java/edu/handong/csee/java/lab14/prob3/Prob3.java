package edu.handong.csee.java.lab14.prob3;								//package name
import java.util.Scanner;												//using scanner

public class Prob3 {													//main class name is prob3
	public static final Powercalc myCalculator = new Powercalc();		//instantiate the powercalc class.
	public static final Scanner in = new Scanner(System.in);			//using scanner

	public static void main(String[] args) {							//call main method
		while(in.hasNextInt()) {										//Loop
			int n = in.nextInt();										//assign. n is input integer value.
			int p = in.nextInt();										//assign. p is input integer value.

			try {														//find the exception process.
				System.out.println(myCalculator.power(n, p));			//print the n's power p
			} catch(Exception e) {										//if exception is happen.
				System.out.println(e);									//print the error message.
			}
		}
	}

}
