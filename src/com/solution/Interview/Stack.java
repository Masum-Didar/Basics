package com.solution.Interview;

public class Stack {
	int cap = 3;
	int MyStack[]= new int[cap];
	int top = -1;
	
	void phush(int x) {
		if(top<cap-1) {
			top = top + 1;
			MyStack[top]= x;
			System.out.println("Data added "+x);
			return;
		}
		System.out.println("Exception! Stack Overflow");
		
		
	}
	 int peek() {
		 if(top<0) {
			 System.out.println("Exception! Stack Underflow");
			 return -1;
		 }
		 
		return MyStack[top]; 
	 }
	 
	 int pop() {
		 if(top<0) {
			 System.out.println("Exception! Stack Underflow");
			 return -1;
		 }
		 int val = top;
		 top = top -1;
		 System.out.println("Successfully removed "+MyStack[val]);
		 return val;
	 }
	 
	 void Display() {
		 System.out.print("Stack : ");
		 for(int i =0; i<=top; i++) {
			 System.out.print(MyStack[i]+" ");
		 }
		 
		 System.out.println("");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My stack running");
		
		Stack obj = new Stack();
		
		obj.phush(10);
		obj.phush(20);
		obj.phush(30);
		obj.Display();
		System.out.println("Peek "+obj.peek());
		obj.pop();
		obj.phush(40);
		
		obj.Display();
		obj.pop();
		obj.phush(50);
		obj.Display();
	}

}
