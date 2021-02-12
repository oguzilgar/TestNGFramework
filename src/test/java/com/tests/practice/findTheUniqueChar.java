package com.tests.practice;

public class findTheUniqueChar {


    public static void main(String[] args) {

        String str = "sdnfkask";
        System.out.println(findTheUniqueChar(str));

    }

    public static String findTheUniqueChar(String str){

        String [] strArr = str.split("");
        String dummy="";

        for(int i=0; i<strArr.length; i++){
            int num=0;
            for(int j=0; j<strArr.length; j++){
                if(strArr[i].equals(strArr[j])){
                    num++;
                }
            }

            if(num==1){
                dummy+=strArr[i];
            }
        }

        return dummy;







    }








































}
