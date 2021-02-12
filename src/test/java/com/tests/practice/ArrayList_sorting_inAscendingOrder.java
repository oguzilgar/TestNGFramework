package com.tests.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_sorting_inAscendingOrder {

    public static void main(String[] args) {

        //sorting ArrayList elements...... Collections.sort(list);
        int[] arr = {10,77, 33,6, 9, 8, 7,7,3};
        List<Integer> list = new ArrayList<>(Arrays.asList(2,34,5,6,6));

        SortingArrayListAsc(list);
        System.out.println("list = " + list);

    }

    public static void SortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) { //i=0,2     j=1   34

                    Integer temp = list.get(i); //2

                    list.set(i, list.get(j));//34

                    list.set(j, temp);//2

                }

            }

        }

    }















}
