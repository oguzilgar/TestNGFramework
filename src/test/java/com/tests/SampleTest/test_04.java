package com.tests.SampleTest;
/*
Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace.

Examples
"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False
 */

public class test_04 {

    public static void main(String[] args) {

        String str = "(){}[]";

        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){


        int counter1=0, counter2=0, counter3=0;

        for(int i=0; i<str.length(); i++) {

            if (("" + str.charAt(i)).equals("(") || ("" + str.charAt(i)).equals(")")) {
                counter1++;
            } else if (("" + str.charAt(i)).equals("{") || ("" + str.charAt(i)).equals("}")) {
                counter2++;
            } else if (("" + str.charAt(i)).equals("[") || ("" + str.charAt(i)).equals("]")) {
                counter3++;
            } else {
                System.out.println("invalid input");
            }
        }

        if (counter1 % 2 != 0 || counter2 % 2 != 0 || counter3 % 2 != 0) {
            return false;
        }

        return  true;
    }

































































}
