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
public class MethodOverloading {
    
    public static void main(String[]args){
        
       MethodOverloading addObj = new MethodOverloading();
      // addObj.add(10, 20);
       //addObj.add(1, 2, 3);
       
       System.out.println(addObj.add(10, 20));
       System.out.println(addObj.add(20, 30, 40));
    }
       
     
     double add( int i , int j){
         return i+j;
         
     }


     int add( int i , int j, int k){
         return i*j+k;
     }

}




