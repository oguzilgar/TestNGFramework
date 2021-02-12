package com.tests.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class remove_JohnFrom_ArrayList {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        names.removeAll( Arrays.asList("Ahmed"));



        System.out.println(names);




    }








}
