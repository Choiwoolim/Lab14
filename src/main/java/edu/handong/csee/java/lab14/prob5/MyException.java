package edu.handong.csee.java.lab14.prob5;			//package name

public class MyException extends Exception{			//class name is MyException. it extends exception
	private String message = null;					//declare the private string type message.

	public MyException() {							//instantiate the myException
		super();									//superclass.
	}

	public MyException(String message) {			//instantiate the my exception class. include message
		super(message);								//super of message
		this.message = message;						//assign the message
	}

	public MyException(Throwable cause) {			//instantiate the my exception class. include cause
		super(cause);								//super of cause
	}

	public String toString() {						//Create the toString method.
		return message;								//return the message
	}

}