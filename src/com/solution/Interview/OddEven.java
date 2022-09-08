package com.solution.Interview;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a[]= {1, 2, 3, 4, 5};
		for(int i = 0; i<a.length; i++ ) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" This number is  Even");
				
			}else {
				System.out.println(a[i]+" This number is Odd");
				
			}
				
		}
	}

}
