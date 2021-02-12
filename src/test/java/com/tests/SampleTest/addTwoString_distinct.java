package com.tests.SampleTest;

/*Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,

each taken only once - coming from s1 or s2.
Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

 */

import java.util.*;

public class addTwoString_distinct {


    public static void main(String[] args) {

        String str1 = "xyaabbbccccdefww";
        String str2 = "xxxxyyyyabklmopq";
        System.out.println(addTwoString_distinct(str1,str2));

    }

    public static String addTwoString_distinct(String str1, String str2){


        String dummy = str1 + str2;

        String summy = "";

        for(int i=0; i<dummy.length(); i++){

                if(!summy.contains("" + dummy.charAt(i))){

                    summy+=dummy.charAt(i);
                }
        }
        
        String [] arr = summy.split("");
        List<String> sorted = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(sorted);

        String bummy = "";
        for (String s : sorted) {
            bummy+=s;
        }

        return bummy;
    }
































}
