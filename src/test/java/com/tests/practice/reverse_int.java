package com.tests.practice;

public class reverse_int {


    public static void main(String[] args) {


        int num = 12245;
        System.out.println(reverseInt(num));

    }

    public static int reverseInt(int num){

        Integer number = new Integer(num);
        String strNum = Integer.toString(number);
        StringBuilder reverse = new StringBuilder(strNum);

        StringBuilder numberstr = reverse.reverse();

        Integer ax = new Integer(String.valueOf(numberstr));
        int reverseInt = ax;

        return reverseInt;

    }


}
