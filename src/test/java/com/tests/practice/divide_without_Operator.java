package com.tests.practice;

public class divide_without_Operator {

    public static void main(String[] args) {

        int num1=10;
        int num2=5;
        devides(num1,num2);


    }
    public static void devides(int num1, int num2) {

        if(num2==0) {

            System.out.println("Invalid Number");
            return;
        }

        System.out.print(num1 +" devid by "+num2 +" is: ");
        int count =0;

        while(num1 >= num2) {

            num1 -= num2;

            count++;
            //how many times come to here is the division and
            // the last value of num1 is remainder
        }
        System.out.println(count+" and remainder is "+num1);
    }










































}
