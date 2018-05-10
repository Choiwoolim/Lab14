package edu.handong.csee.java.lab14.prob3;				//package name

public class Powercalc {								//class name is Powercalc
	public long power(int n, int p) throws Exception{	//Create the public long type power method. it makes exception
		long result = 0;								//Declare the long type variable.
		
		result = (long)Math.pow(n, p);					//result is calculated n^p
		if(n<0 || p<0) {								//n is less than 0 or p is less than 0
			throw new Exception("n or p should not be negative.");	//create the new exception and store.
		}
		if(n==0 && p ==0) {								//n is 0 and p is zero
			throw new Exception("n and p should not be zero.");		//create the new exception and store.
		}
		return result;									//return result.
	}

}
