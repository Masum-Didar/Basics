package com.solution.Interview;

public abstract class Abs {
	
	abstract void msg();
	

}

class Masum extends Abs{
	@Override
	void msg() {
		System.out.print("Masum : ");
		System.out.println("Hello everyone");
	}
}
class Didar extends Abs{
	@Override
	void msg() {
		System.out.print("Didar : ");
		System.out.println("Hello! How are you?");
	}
}

