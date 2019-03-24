/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprograms;

import java.util.Scanner;

/**
 *
 * @author cmehta
 */
public class PrimeNumberBetweenTwoNumber {
    
    public static void main(String[]args){
        
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Enter the last number");
        int last = sc.nextInt();
        System.out.println("list of prime number between" +first +" and " +last);
        for(int i=first;i<=last;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }        
    }
    
    public static boolean isPrime(int num){
        
       if(num<=1){
           return false;
       }
       for(int i=2;i<num;i++){
           if(num%i==0){
               return false;
           }
       }
       return true;
    }        
}
