package com.tests.practice;

import java.util.Scanner;

public class sumOfFirstAndLastDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number");
        String number = sc.nextLine();
        
        //String strNumber = String.valueOf(number);
        String [] arrNumber = number.split("");

        int firstNumber = Integer.parseInt(arrNumber[0]);
        int secondNumber = Integer.parseInt(arrNumber[arrNumber.length-1]);

        System.out.println(firstNumber + secondNumber);


      
































    }


















































}
