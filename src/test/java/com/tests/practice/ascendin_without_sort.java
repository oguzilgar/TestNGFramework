package com.tests.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ascendin_without_sort {


    public static void main(String[] args) {

        int[] arr = {1,34, 10, 9, 8, 24,16};

        System.out.println(Arrays.toString(Sort(arr)));

    }

    //the best answer
    public static int[] Sort(int[] a) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: a)
            list.add(each);

        for(int i=0; i < a.length; i++) {

            a[i] = findMin(list);

            list.remove(Integer.valueOf(a[i]));

        }

        return a;

    }


    public static int findMin(ArrayList<Integer> a) {


        int min =Integer.MAX_VALUE;

        for(int each: a)

            if(each<min){
                min=each;
            }

        return min;













    }











































}
