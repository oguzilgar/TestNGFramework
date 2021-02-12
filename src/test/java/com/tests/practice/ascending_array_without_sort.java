package com.tests.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ascending_array_without_sort {

    public static void main(String[] args) {

        int[] arr = {10,77, 33,6, 9, 8, 7,7,3};

        System.out.println(Arrays.toString(Sort(arr)));

    }

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

            min = Math.min(min, each);

        return min;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
