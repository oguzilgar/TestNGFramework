package com.tests.practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date_format {


    public static void main(String[] args) {
        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String expectedDate = formatter.format(date);
    }
}
