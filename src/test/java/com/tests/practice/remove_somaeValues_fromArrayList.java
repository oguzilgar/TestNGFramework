package com.tests.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class remove_somaeValues_fromArrayList {


    public static void main(String[] args) {

        /*1.way
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int  each : lists1) {

            if (each < 100) {

                lists2.add(each);

                list1 = list2;
            }
        }
        System.out.println(list1);

  */

        //2.way
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        list.removeIf(p -> p>100);

        System.out.println(list);


    }















































}
