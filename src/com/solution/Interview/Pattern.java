package com.solution.Interview;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
		for (int i = 1; i <=n; i++) {
			// space
			for(int j = 1; j<=n-1; j--) {
				System.out.print(" ");
			}
			// star
			for(int j = 1; j<=n; j++) {
				System.out.print("*");
				}			
			System.out.println();
		}
		
	}

}
