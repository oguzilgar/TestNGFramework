package com.tests.practice;

import java.util.Arrays;

public class sameLetter {

    public static void main(String[] args) {

        String firststr= "abcde";
        String secondstr= "cbdae";
        System.out.println("sameArray(firststr,secondstr) = " + sameArray(firststr,secondstr));
    }

    public static boolean sameArray(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String firstLetter = ""; String secondLetter="";
        for (char c : ch1) {
            firstLetter+=""+c;
        }
        for (char c : ch2) {
            secondLetter+=""+c;
        }
        return firstLetter.equals(secondLetter);
    }

    //Use toCharArray to convert them to char Array
    //then sort the letters
    //then use forEach loop to assign them to String
    //then use equals method

}
/*
public static boolean Same(String str1, String str2) {

str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

return  str1.equals(str2);

}
 */