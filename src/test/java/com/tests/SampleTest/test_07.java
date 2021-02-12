package com.tests.SampleTest;
/*
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
 */

public class test_07 {

    public static void main(String[] args) {
        
        String words = "This is an example!";
        System.out.println(reverseWords(words));
        
    }
    
    public static String reverseWords(String str){
        
        String [] strArr = str.split(" ");
        String dummy = "";
        for (String s : strArr) {
            StringBuilder strBuild = new StringBuilder(s);
            if(!(dummy.equals(""))) {
                dummy += " ";
            }
            dummy+=strBuild.reverse();
            
        }
        return dummy;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
