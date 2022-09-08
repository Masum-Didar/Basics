package com.solution.OOP;

public class PrivateConstructor {
	
	static PrivateConstructor obj = null;
	
	public int x=25;
	
	private PrivateConstructor() {
		
	}
	
	public static PrivateConstructor displayInstance() {
		
		  if(obj==null) 
			 obj = new PrivateConstructor();
		 
			return obj;
		
	}

}
