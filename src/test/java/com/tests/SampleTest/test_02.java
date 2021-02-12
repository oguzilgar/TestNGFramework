package com.tests.SampleTest;
/*
Complete the function which get an input number n such that n >= 10 and n < 10000, then:

Sum all the digits of n.
Subtract the sum from n, and it is your new n.
If the new n is in the list below return the associated fruit, otherwise return back to task 1.
Example
n = 325
sum = 3+2+5 = 10
n = 325-10 = 315 (not in the list)
sum = 3+1+5 = 9
n = 315-9 = 306 (not in the list)
sum = 3+0+6 = 9
n =306-9 = 297 (not in the list)
. .
. ...until you find the first n in the list below.
 */

import com.google.gson.internal.$Gson$Preconditions;

public class test_02 {


    public static void main(String[] args) {

        int number = 3455;
        System.out.println("lastSubtracted(number) = " + lastSubtracted(number));

    }

    public static int lastSubtracted(int num){

        while (num>=10){
            String strNum = String.valueOf(num);

            int sum=0;
            for(int i=0; i<strNum.length(); i++){

                int num1 = Integer.valueOf(""+strNum.charAt(i));
                sum +=num1;

            }

            System.out.println("sum = " + sum);
             num = num - sum;
            System.out.println("num = " + num);

        }
        return num;
    }



































































}
