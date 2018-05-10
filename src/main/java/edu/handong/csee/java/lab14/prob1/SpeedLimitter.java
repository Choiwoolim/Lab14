package edu.handong.csee.java.lab14.prob1;					//Package name

public class SpeedLimitter {							//class name is SpeedLimitter
	private int speed = 0;								//Declare the private integer variable speed
	private int limit = 0;								//Declare the private integer variable limit

	public SpeedLimitter(int limit, int speed) {		//Create the SpeedLimitter method.
		this.limit = limit;								//assign the limit value.
		this.speed = speed;								//assign the speed value.
	}

	public void warnSpeedLimit() {						//Create the void type warnSpeedLimit method
		try {											//Find a Exception.
			if(this.speed>this.limit) {					//speed is 
				throw new Exception("Speed Limit " + this.limit + "km exceeded");		//add the new Exception's message
			}
			System.out.println("You are a low abiding citizen! ");		//print the following sentence.
		}catch(Exception e) {											//Exception happen!!
			System.out.println(e.getMessage());							//print the exception message
			System.out.println("You are being fined. ");				//print the following sentence.
		}
		System.out.println("You're current speed : " + this.speed);		//Print the following sentence.
	}


}
