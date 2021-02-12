package com.tests.practice;

import java.util.Arrays;

public class FindMax {

    public static void main(String[] args) {

        int [] arr = {1,2,3,12,4,5,6};

        System.out.println("maxValue(arr) = " + maxValue(arr));



    }
    //1 way
    public static int maxValue(int[] n) {


        int max= Integer.MIN_VALUE;

        for (int each : n) {
            if(each>max){
                max=each;
            }
        }

        return max;

    }

    //1 way
    public static int maxValue1(int[] n) {

        Arrays.sort(n);

        return n[n.length - 1];

    }


}






































