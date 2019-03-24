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
public class NLargestNumberInAnArray {
    
    public static void main(String[]args){
        
       int[] arr = {1,2,4,6,7,0,10};  //0,1,2,4,6,7,10
        int ln = arr.length;
        int temp;
        for(int i=0;i<ln;i++){
            for(int j=1;j<ln;j++){
                if(arr[i]>arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] =temp;
                }
            }            
        }
        
        
        System.out.println("Largest number in array is :- " + arr[ln-(ln-1)]); //largest number
        System.out.println("2nd largest number in array is :- " +arr[ln-2]); //2nd argest number
        System.out.println("3rd largest number in array is :- " +arr[ln-3]); //3rd argest number
    
    }
    
    /*public static int thirdLargestNumber(){
        
        int[] arr = {1,2,4,6,7,0};
        int ln = arr.length;
        int temp;
        for(int i=0;i<ln;i++){
            for(int j=1;j<ln;j++){
                if(arr[i]>arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] =temp;
                }
            }            
        }
        return arr[ln-1];
    }*/   
}
