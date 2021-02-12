package com.tests.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class findMin_forArray {


    public static void main(String[] args) {

        int [] arr = {23,45,3,42,2,11,25};

        System.out.println(Arrays.toString(Sort(arr)));


    }

    public static int[] Sort(int arr []){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }


        for (int i = 0; i < arr.length; i++) {

            arr[i]=FindMin(list);
            list.remove(Integer.valueOf(arr[i]));

        }

        System.out.println("list = " + list);

        return arr;

    }

    public static int FindMin(ArrayList<Integer> list){

        int min = list.get(0);

        for (Integer integer : list) {

            if(integer<min){
                min=integer;
            }
        }

        return min;




    }


   // https://github.com/oguzilgar/Rakuten_tv.git
    //github.com/oguzilgar/abc.git
    //git remote add origin https://github.com/oguzilgar/Rakuten_tv.git
    //git push -u origin master












































}
