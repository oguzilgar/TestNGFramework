package com.tests.practice;

import java.util.*;

public class removeDuplicateFromString {

    public static void main(String[] args) {

        String str = "sdhfsaufgau";
        System.out.println(removeDuplicate(str));
    }

    public static Set<String> removeDuplicate(String word){

        List<String> chars = new ArrayList<String>(Arrays.asList(word.split("")));
        Collections.sort(chars);
        Set<String> setList = new TreeSet<>(chars);

        return setList;
    }



























}
