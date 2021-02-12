package com.tests.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class moveAllZerosTotheEnd {
    //Write a method that can move all the zeros to

   // last indexes of the array (Do Not Use Sort Method)

    public static void main(String[] args) {

        int [] arr1 =   {1,0,2,0,3,0,4,0};
        moveZeros(arr1);
        System.out.println(Arrays.toString(moveZeros(arr1)));
        
        int [] arr2 = new int[4];
        arr2[0]=12;
        arr2[1] = 23;

        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

    }

    public static int[] moveZeros( int[]  arr ) {

        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {

            list.add(each);

            countZero+= (each==0)?1:0;                          //can be done by if_else
        }

        list.removeAll(Arrays.asList(0));                       //very useful
        System.out.println("list  = " + list);

        arr = new int[arr.length];   //lenth 6

        for(int i=0; i <arr.length-countZero; i++ ) {

            arr[i] = list.get(i);

        }

        return arr;

    }


// Write a method andint array as parameter.
// create an arrayList and put all the elements inside that.
// Find the number of "zeros". Use "removeAll" as list.removeAll(Arrays.asList(0));
// to delete all zeros. Create new array and put the elements not zero inside that from list and return



































}
