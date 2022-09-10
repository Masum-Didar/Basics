package com.solution.Practice;

//Que: find out the value of A[1] after execution the following program

public class Question_01 {

	public static void main(String[] args) {
		
		int A[] = {0, 2, 4, 1, 3};
		for(int i = 0; i<A.length; i++) {
			A[i] = A[(A[i] +3) % A.length];
			
			System.out.println(A[i]);
		}
		System.out.println("..............................");
		System.out.println(A[A[0]+3]);
		System.out.println(A[A[1]+3]);
		System.out.println("..............................");
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A.length);
		System.out.println("..............................");
		System.out.println(3%A.length);
		System.out.println(A[A[1]+3]);
		
		/*
		 * int b = 1; int div = b % A.length; System.out.println(div);
		 * System.out.println(A.length);
		 */
	}

}
