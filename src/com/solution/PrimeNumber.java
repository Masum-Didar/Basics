package com.solution;

public class PrimeNumber {

	void checkPrime(int n) {
		if(n==1) {
			System.out.println("Please Enter geather than 1");
		}
		for(int i =2; i<n; i++) {
			if(n%i!=0) {
				System.out.println(n+" This is a Prime number");
				break;
			}else
				System.out.println(n+" This is not prime number");
			break;
			
		}
	}
	public static void main(String[] args) {
		
		PrimeNumber obj = new PrimeNumber();
		
		obj.checkPrime(52);
		obj.checkPrime(7);
		obj.checkPrime(11);
		obj.checkPrime(68545);
		// TODO Auto-generated method stub

	}

}
