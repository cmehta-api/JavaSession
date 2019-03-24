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
public class PalindromeNumber {
    
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Eter the number to be checked palindrome");
        int num = sc.nextInt();
        //121
        int r;
        int temp;
        int sum = 0;
        temp = num;
        while(num>0){
          r = num%10;  //121
          sum = (sum*10)+r; //121
          num= num/10;  //00
        }
        
        if(temp==sum){
            
            System.out.println(+temp + " is palindrome");
        }else{
            System.out.println(+temp + " is not palindrome");
            //int i = 2%10;
            //int j= 2/10;
            //System.out.println(+i+ "and" +j);
        }
    }
    
}
