package com.tests.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class concatTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(ConcatTwoArrays(arr1, arr2)));

    }

    public static int[] ConcatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {

            result[i] = each;
            i++;
        }

        for (int each : arr2) {

            result[i] = each;
            i++;

        }
        return result;
    }

//Create a method and take those two arrays then create an int array with
// a lenth of those two arrays. to follow the size create an int number.
// add first array then second one by using the int number


    public static int[] ConcatTwoArrays1(int[] arr1, int[] arr2) {


        List<Integer> list = new ArrayList<>();

        for (int num : arr1) {
            list.add(num);
        }

        for (int num2 : arr2) {
            list.add(num2);
        }


        int [] arrresult = new int[list.size()];

        for (int i = 0; i < arrresult.length; i++) {
              arrresult[i] = list.get(i);

        }


        return arrresult;
    }



























}





























