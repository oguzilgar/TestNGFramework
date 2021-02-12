package com.tests.SampleTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.

#Example 1: a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]

#Example 2: a1 = ["tarp", "mice", "bull"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns []
 */
public class test_06 {

    public static void main(String[] args) {

        String [] arr1 = {"arp", "live", "strong"};
        String [] arr2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        System.out.println((subString(arr1,arr2)));
    }

    public static List<String> subString(String [] strArr1, String[] strArr2){

        String [] newArr = new String[strArr2.length];

        for (int i = 0; i < strArr2.length; i++) {
            for (int j = 0; j < strArr1.length; j++) {
                if(strArr2[i].contains(strArr1[j])){
                    newArr[i] = strArr1[j];
                }

            }
        }
        List<String> stringList =new ArrayList<>();
        for (String s : newArr) {
            if(!stringList.contains(s)){
                stringList.add(s);
            }
        }


    return stringList;
    }































































}
