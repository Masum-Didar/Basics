package com.solution.Practice;

//Question: Print the all character (A-Z)
public class Question_03 {
	 void charList(char chai){
		while(chai<='Z') {
			System.out.print(chai+" ");
			chai++;
		}
	}

	public static void main(String[] args) {
		Question_03 obj = new Question_03();
		obj.charList('A');
	}

}
