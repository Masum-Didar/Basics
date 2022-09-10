package com.solution.Practice;

//Question: What is output of this program

	public class Question_02 {
		
		static void quiz(int n) {
			if(n==1) {
				return;
			}
			System.out.print(n +1+" ");
			System.out.println();
			quiz(n-1);
			System.out.print(n +1+" ");
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			quiz(10);
	
		}

}
