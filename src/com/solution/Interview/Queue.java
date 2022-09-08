package com.solution.Interview;

public class Queue {
	int cap = 3;
	int MyQueue[] = new int[cap];
	int front = -1;
	int rear = -1;
	int tItem = 0;
	
	void enQueue(int x) {
		if(cap==tItem) {
			System.out.println("Exception! Queue Over Flow");
			return;
		}
		 rear = (rear +1) % cap;
		 tItem++;
		 System.out.println("Data added "+x);
		
	}
	
	int deQueue() {
		if(tItem==0) {
			System.out.println("Exception Under flow");
			return -1;
		}
		front = (front + 1) % cap;
		tItem --;
		System.out.println("Succesfully removed");
		return MyQueue[front];
	}
	
	void display() {
		System.out.println("MyQueue List is : ");
		for(int i=0; i<cap; i++)
			System.out.print(MyQueue[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue obj = new Queue();
		obj.deQueue();
		obj.enQueue(10);
		obj.enQueue(20);
		obj.enQueue(30);
		obj.deQueue();
		obj.enQueue(40);
		obj.display();
	}

}
