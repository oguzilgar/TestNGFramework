package com.tests.practice;

public class Parantheses_validation {


    public static void main(String[] args) {


        String str = "{}[]";

        System.out.println("primeNumber(str) = " + parantheses(str));

    }

    public static boolean parantheses(String str) {

        if (null == str || ((str.length() % 2) != 0)) {
            return false;
        } else {
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    return false;
                }
            }
        }

        return true;
    }
}
