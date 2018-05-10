package edu.handong.csee.java.lab14.prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inexception {
	private int x = 0;
	private int y = 0;
	
	public Inexception() {
	}
	
	public void error_det() {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("x: ");
			x = keyboard.nextInt();
			System.out.print("y: ");
			y = keyboard.nextInt();
			System.out.println(this.x / this.y);
		}
		catch(ArithmeticException e) {
			System.out.println("java.Lang.ArithmeticException: " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("java.utilInputMismatchException");
		}
		catch(Exception e) {
			System.out.println("Some other exception has occured: " + e.getMessage());
		}
	}


}
