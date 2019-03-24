/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprograms;

/**
 *
 * @author cmehta
 */
public class BubbleSort {
    
    public static void main (String[]args){
        
        int[] num = {1,9,5,6,0,7,8,9};
        int temp;
        for(int i=0;i<7;i++){
            for(int j=1;j<7;j++){
                if(num[j-1]>num[j]){
                 temp=num[j-1];
                 num[j-1] = num[j];
                 num[j] = temp;                    
                }
            }
        } 
        
        for(int k=0;k<7;k++){
            System.out.println("sorted values are :- " +num[k]); 
        }
    }    
}
