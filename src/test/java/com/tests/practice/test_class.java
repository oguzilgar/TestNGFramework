package com.tests.practice;

public class test_class {

    private  String str;

    public test_class(String str) {
        this.str = str;
        System.out.println("str = " + str);
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "test_class{" +
                "str='" + str + '\'' +
                '}';
    }
}
