package com.tests.SampleTest;
/*
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items.
We want to create the text that should be displayed next to such an item.

Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item.
It must return the display text as shown in the examples:

likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
 */

public class test_08 {

    public static void main(String[] args) {

        String [] names = {"Alex", "Jacob", "Mark", "Max","Ouz","Mary","John"};
        likesName(names);
    }
    public static void likesName(String [] names){
        int lengthOfArr = names.length;
        if(lengthOfArr==0) {
            System.out.println("no one likes this");
        }else if(lengthOfArr==1) {
            System.out.println(names[0] + " likes this");
        }else if(lengthOfArr==2) {
            System.out.println(names[0] + " and " + names[1] + " like this");
        }else if(lengthOfArr==3) {
            System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " like this");
        }else {
            System.out.println(names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this");
        }
    }













































}
