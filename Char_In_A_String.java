/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cmehta
 */
public class Char_In_A_String {
    
    
    public static void main(String[]args) throws IOException {
        Char_In_A_String charObj = new Char_In_A_String();
        //charObj.charLength();
        //charObj.CountVowelConsonant();
        charObj.Anagram();
        //charObj.ReverseString();
       // charObj.readTextFileContents();
        
        
    }
    
    
    
    public void charLength(){
        int count =0;
        System.out.println("Enter the string");
        
        Scanner sc = new Scanner(System.in);
        
        String sampleString = sc.nextLine();
        
        int strLenght = sampleString.length();
        System.out.println(sampleString.length());
        
    }
    
    
    public void CountVowelConsonant (){
        
        int vCount = 0;
        int cCount = 0;
        
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        
        String sampleString = sc.nextLine();
        
        sampleString = sampleString.toLowerCase();
        
        System.out.println(sampleString);
        
        for(int i=0;i<sampleString.length();i++){
            if(sampleString.charAt(i)=='a' || sampleString.charAt(i)=='e' || sampleString.charAt(i)=='i' || sampleString.charAt(i)=='o'|| sampleString.charAt(i)=='u') {
                System.out.println(sampleString.charAt(i));
                vCount++;
                
            }else if(sampleString.charAt(i)>'a' && sampleString.charAt(i)<='z'){
                cCount++;                
            }           
        }
        
        System.out.println("vowel counts: "+vCount);
        System.out.println("consonant counts: "+cCount);
        
    }
    
    
    public void Anagram(){
        
        //Enter the string  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string"); 
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();
        
        //convert into lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        //compare the string
        
        
        
        if (str1.length()!=str2.length()){
            System.out.println("Both strings are not anagram");
        }else{
            
            char[] string1 = str1.toCharArray(); //convert string arrays to char arrays
            char[] string2 = str2.toCharArray(); //convert string arrays to char arrays
            
            Arrays.sort(string1);
            Arrays.sort(string2);
            
            if(Arrays.equals(string2, string2)){
              System.out.println("Both strings are anagram");  
            }else{
              System.out.println("Both strings are not anagram");  
            }                        
        }              
    }
    
    
    
    public void ReverseString(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed ");
        String actualString = sc.nextLine();
        
        String reversedStr  = "";
        
        for(int i = actualString.length()-2;i>=0;i--){
            reversedStr  = reversedStr +actualString.charAt(i);           
            
        }
        
        System.out.println("Actual string is : " +actualString);
        
        System.out.println("Reversed string is : " +reversedStr);  
        
        
        
    }
    
    
    public void readTextFileContents() throws FileNotFoundException, IOException{
        
        FileReader  fr = new FileReader("D:\\Users\\cmehta\\Downloads\\readMe.txt");
        int i;
        
        while ((i=fr.read())!=-1){
               
        System.out.print((char)i);    
        fr.close();
    }
        
        
    }
    
}
