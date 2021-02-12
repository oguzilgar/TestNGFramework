package com.tests.test;

import java.util.Scanner;

public class test_01 {

    public static void main(String[] args) {

        double price = 7.5;

        System.out.println(buyCoffe(price));

    }

        public static double buyCoffe(double price){

            Scanner sc = new Scanner(System.in);
            System.out.println("Please insert coin");

            int totalCoins =sc.nextInt();

            if(totalCoins == 1){
                totalCoins += 100;
            }else if(totalCoins == 2){
                totalCoins += 200;
            }else{

            }

            while (totalCoins<price){
            System.out.println("please  insert more coins");

                if(totalCoins == 1){
                    totalCoins += 100;
                }else if(totalCoins == 2){
                    totalCoins += 200;
                }else{

                }

            totalCoins = totalCoins + sc.nextInt();

        };


            double result = totalCoins - price;


        return result;

        }














}
