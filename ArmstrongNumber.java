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
public class ArmstrongNumber {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("entter the number");
        int num = sc.nextInt();
        int r;
        int sum=0;
        //121 = 1*1*1 +2*2*+1*1*1*
        
        while(num>0){
            r = num%10;
            sum = sum+(r*r*r);
            num= num/10;
        }
        System.out.println("Armstrong values is "  +sum);
    }
    
}
