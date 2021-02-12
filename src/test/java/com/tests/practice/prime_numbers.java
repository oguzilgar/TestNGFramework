package com.tests.practice;

public class prime_numbers {
    public static void main(String[] args) {

        int number=10;
        System.out.println(primeNumber(number));


    }
    public static boolean primeNumber(int num) {

        boolean result = true;

        if(num <= 1) {

            return result;

        }
//the prime number must not be divisible by
// any number less than itself till 2.
        for(int i = 2; i < num; i++) {

            if(num % i == 0 ) {

                return false;
            }

        }

        return result;
    }














}
