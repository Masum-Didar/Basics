package com.solution;

public class Add {
	public void sumOfDigit(int digit) {
		int temp = digit;
		int sum = 0;
		while(temp!=0) {
			int r= temp%10;
			    sum = sum + r;
			    temp = temp / 10;
		} 
		System.out.println("Sum of "+digit+" = "+sum);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int c = 3;
		int r = a / c;
		int R = a % c;
		System.out.println("Congratulation!\nYour java environment is ready now!");
		System.out.println("r is: "+r);
		System.out.println("R is : "+R);
		int aa[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i=0; i<aa.length; i++) {
			if(aa[i]%2==0) {
				System.out.println(aa[i]+" is Even number");
			}
			else
				System.out.println(aa[i]+" is Odd number");
		}
		
		Add obj = new  Add();
		obj.sumOfDigit(456);
		obj.sumOfDigit(78945655);
		
	} 

}
