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
public class FibonacciSeries {
    
    public static void main(String[] args){
        int n1= 0;
        int n2 = 1;
        int n3;
        System.out.println("print the value of n1 & n2 :- " +n1 +" "+n2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert into febonacci");
        int num = sc.nextInt();

        for(int i=2;i<=num;++i){
            n3 = n1+n2;
            System.out.println("the value of num:- " +n3);
            n1= n2;
            n2= n3;
        }
    }
    
}
