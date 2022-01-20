
package interview;


public class sumofDigit {
    public static void main(String[] args) {
        int digit =123;
        int temp = digit;
        int sum =0; 
        int r;
        while(temp!=0){
           r =temp%10;
           sum = sum +r;
           temp = temp/10;
           
        }
        System.out.println("The Number of sum  = "+sum);
    }
    
}
