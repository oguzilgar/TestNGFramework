package com.tests.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_ascending_without_sort {


    public static void main(String[] args) {
        int[] arr = {17, 7, 3};

        sortArray(arr);
        System.out.println(" Arrays.toString(sortArray(arr)) = " +  Arrays.toString(sortArray(arr)));


    }

    public static int[] sortArray(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        for (int i=0; i<list.size(); i++){    //i= 0

            for (int j=0; j<list.size(); j++){

                if(list.get(i)<list.get(j)){  // j=1

                    Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);

                }
            }
        }

        int [] newArray = new int[list.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = list.get(i);

        }







        return newArray;

    }




}
