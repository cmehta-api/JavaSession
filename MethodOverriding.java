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
public class MethodOverriding {    //Main class
    
    public static void main(String[]args){  //Main method 
       Bank bankObj = new Bank();
       System.out.println("Bank interest rate: " +bankObj.getIntrestRate());
       
       SBI sbiObj = new SBI();
       System.out.println("SBI interest rate:  " +sbiObj.getIntrestRate());
       
       ICICI iciciObj = new ICICI();
       System.out.println("ICICI interest rate:" +iciciObj.getIntrestRate());
       
       RBI rbiObj = new RBI();
       System.out.println("RBI interest rate: " +rbiObj.getIntrestRate());
       
        
    }
    
   
}


class Bank {
    
    int getIntrestRate(){
        return 0;
    }
    
}

class SBI extends Bank{
    @Override
    int getIntrestRate(){
        return 6;
    }
}

class ICICI extends Bank {
    @Override
    int getIntrestRate(){
        return 7;
    }
}

class RBI {
    int getIntrestRate(){
        return (int)6.5;
    }
}

