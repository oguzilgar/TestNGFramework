package com.tests.practice;

public class sumOfDigits_inAsTRING {


    public static void main(String[] args) {

        String str = "12dfg21";
        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println(Character.isDigit(str.charAt(0)));

        sumOfDigits(str);
        System.out.println("sumOfDigits(str) = " + sumOfDigits(str));

    }
    public  static int  sumOfDigits(String s) {

       int sum=0;

        for (int i = 0; i < s.length(); i++) {

            if(Character.isDigit(s.charAt(i))){

                sum+= Integer.valueOf(""+s.charAt(i));

            }

        }
        return sum;

    }
































}
