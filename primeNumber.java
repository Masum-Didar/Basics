
package interview;

import java.util.Scanner;


public class primeNumber {
    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Integer Number: ");
        int n = sc.nextInt();
        int count = 0;
        if(n==1){
            System.out.println("Enter a number Greater than 1");
        }
        
         for(int i=2; i<n; i++){
                if(n%i==0){
                	   count++;   
                       break;
                }
       }
         if(count==0) {
        	 System.out.println("The number is prime");
         }else
        	 System.out.println("The number is not prime");
          
        
    }
    
}
