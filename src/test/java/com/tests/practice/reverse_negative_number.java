package com.tests.practice;

public class reverse_negative_number {

    public static void main(String[] args) {


        System.out.println("reverseNum(-555) = " + reverseNum(-5));

    }

    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }

        return Integer.valueOf(str);

    }











    
}
