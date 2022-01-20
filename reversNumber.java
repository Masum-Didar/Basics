/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author mamas
 */
public class reversNumber {
    public static void main(String[] args) {
        int digit =323;
        int temp = digit;
        int revers =0; 
        int r;
        while(temp!=0){
           r =temp%10;
           revers = revers*10 +r;
           temp = temp/10;
           
        }
        
        if(digit==revers){
            System.out.println("The number plindrom "+revers);
        }
        else
        System.out.println("The Number not plindrom number "+revers);
    }
    
}
