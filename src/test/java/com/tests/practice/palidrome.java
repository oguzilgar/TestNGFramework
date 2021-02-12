package com.tests.practice;

public class palidrome {


    public static void main(String[] args) {

        String word = "madam";
        System.out.println(palindrome(word));

    }

    public static boolean palindrome(String word){

        int head = 0;
        int tail = word.length()-1;

        while (head < tail){

            if(word.charAt(head) != word.charAt(tail)){

                return false;
            }

            head++;
            tail--;

        }

        return true;
    }

















































}
