
package interview;

import java.util.Scanner;


public class facTest {
    public static void main(String[] args) {
        factorialRecursion ob = new factorialRecursion();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Factorial Number: ");
        int n = sc.nextInt();
        
        int result= ob.fac(n);
        System.out.println("Factorial of "+n+" = "+result);
    }
    
}
