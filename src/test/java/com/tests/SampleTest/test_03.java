package com.tests.SampleTest;
/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 The first word within the output should be capitalized only
 if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

Examples
toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"

toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior
 */

public class test_03 {

    public static void main(String[] args) {

        String str = "The_Stealth_Warrior";

        System.out.println("toCamelCase(str) = " + toCamelCase(str));

    }

    public static String toCamelCase(String str){

        String dummy = "";
        for (int i = 0; i < str.length(); i++) {

            if(("" + str.charAt(i)).equals("-")){
                String summy = ""+str.charAt(i+1);
                dummy = dummy + summy.toUpperCase();
                i++;
            }else if(("" + str.charAt(i)).equals("_")){
                continue;
            }else{
                dummy = dummy + str.charAt(i);
            }

        }

        return dummy;
    }









































}
