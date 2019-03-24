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
public class PalindromeString {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("provide the string");
        String str = sc.nextLine();
        String rev = "";
        int strlen = str.length();
        for(int i=strlen-1;i>=0;i--){
            
            rev= rev+str.charAt(i);
        }
        
        if(str.equals(rev)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("String is not palindrom");
        }
    }
    
}
