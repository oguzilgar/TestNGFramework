package com.tests.SampleTest;
/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
 */

public class test_05 {

    public static void main(String[] args) {

        String str = "ab rAacadiab_raO";
        System.out.println(numberOfVowels(str));
    }

    public static int numberOfVowels(String str){
        String theWord = str.toLowerCase();
        int counter = 0;
        for (int i = 0; i < theWord.length(); i++) {
            if(("" + theWord.charAt(i)).equals("a") || ("" + theWord.charAt(i)).equals("e") || ("" + theWord.charAt(i)).equals("i") || ("" + theWord.charAt(i)).equals("o")){
                counter++;
            }else{
                continue;
            }
        }
        return counter;
    }
















































}
