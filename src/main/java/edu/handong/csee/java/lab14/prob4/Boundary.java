package edu.handong.csee.java.lab14.prob4;				//package name

public class Boundary {									//class name is boundary
	private static int [] arr = new int[5];				//declare the integer array. and assign 
	private static int cnt = 0;							//declare the private static integer variable cnt.
	public void receive(int num) throws ArrayIndexOutOfBoundsException{		//create the public void type method. it makes exception
		int i = cnt;									// declare the integer variable i and assign i
		arr[i] = num;									//arr[i] is assigned the num value.
		cnt++;											//cnt = cnt+1
		System.out.printf("arr[%d] <- %d \n", i, num);	//print the following sentence.
	}

}
