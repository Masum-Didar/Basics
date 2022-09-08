package com.solution.OOP;

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateConstructor instance1 = PrivateConstructor.displayInstance();
		PrivateConstructor instance2 = PrivateConstructor.displayInstance();
		
		instance1.x = instance1.x+12;
		instance2.x = instance1.x+1;
		
		System.out.println(instance1.x);
		System.out.println(instance2.x);

	}

}
