package com.tests.practice;

public class reverse_number_withOut_firstZero {

    public static void main(String[] args) {






    }

    public static void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (N % 10 != 0) {
                enable_print = 1;
                System.out.print(N % 10);
            } else if (enable_print == 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }






}
