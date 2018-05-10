package edu.handong.csee.java.lab14.prob6;				//package name

public class CustomID extends Exception{					// class name is CustomID it extends Exception
	private String[] races = new String[] {"Vulcans", "Romulan", "Klingons"};	//declare the stirng type races. and assign string following value.
	private String name = "";	//declare the string type name variable. and it has null.
	private int age = 0;		//declare the private integer type age variable.
	private String race = "";	//Declare the private string type race variable. it is null.
	private int state = 0;		//declare the private integer type state variable.

	public void set_name(String str) throws Exception{			//create the set_name method. it creates a new exception
		if(str.length() < 5) {			//if str's length less than 5
			state = 0;		//state conditon is 0
			throw new Exception("Your name is short! Try again!"); //store the new exception
		}
		else {														//else condition
			this.name = str;										//assign the name
			System.out.println("Name is valid");					//print the following setence.
			System.out.println("Name: " + this.name);				//print the name
			state++;												//state = state + 1 (state = 1)
		}
	}
	public void set_age(int num) throws Exception{					//create the set_age method. it creates a new exception
		if(num < 18) {												//if num is less than 18
			state = 1;												//state condition is 1
			throw new Exception("You are too young! Try again!");	//store the new exception
		}
		else {														//else condition
			this.age = num;											//assign the age
			System.out.println("Age is valid");						//print the following sentenece.
			System.out.println("Age: " + this.age);					//print age
			state++;												//state = state + 1 ( state = 2)
		}
	}

	public void set_race(String race) throws Exception{				//create the set_race method. it creates a new exception
		for(int i = 0; i<races.length; i++) {						//loop
			if(races[i].equals(race)) {								//races[i] and race is equal
				this.race = races[i];								//assign the race
				System.out.println("Race is valid");				//print the following sentence.
				System.out.println("Race: " + races[i]);			//print race
				state = 0;											//state condition initiallize. (state = 0)
				return;												//return
			}
		}
		state = 2;													//not eqaul all the races
		throw new Exception("Human! Try again.");					//store the new exception
	}
	public int getState() {											//create the integer variable getState
		return state;												//return state
	}

}
