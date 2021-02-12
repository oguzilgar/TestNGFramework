package com.tests.SampleTest;

public class oddNumberOfTimes_inAnArray {

    public static void main(String[] args){
        int [] arr ={2,2,3,2,2,3,5,5,5};

        System.out.println(findIt(arr));
    }

    public static int findIt(int[] a) {

        int odd=0;

        for(int i=0; i<a.length; i++){

            int counter=1;

            for(int j=0; j<a.length; j++){

                if(i==j){
                    continue;
                }

                if(a[i]==a[j]){
                    counter++;
                }

            }

            if(counter%2!=0){
                odd=a[i];
                return odd;
            }
        }
        return odd;
    }


}
