package com.tests.practice;

import java.util.Arrays;

public class FindMin {


    public static int maxValue( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;

    }


    public static int maxValue1( int[]  n ) {

        Arrays.sort( n );

        return  n [ 0 ];

    }







































}
