package com.tests.SampleTest;
/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 The first word within the output should be capitalized only
 if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

Examples
toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"

toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior
 */

public class Aaaa_practice {

    public static void main(String[] args) {

        String str = "the-stealth-warrior";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){

        String dummy="";
        for(int i=0; i<str.length(); i++){

            if((""+str.charAt(i)).equals("-")){
                String summy = ""+str.charAt(i+1);
                dummy = dummy + summy.toUpperCase();
                i++;
            }else if((""+str.charAt(i)).equals("_")) {
            }else{
                dummy= dummy + str.charAt(i);
            }
        }
        return dummy;
    }
}
