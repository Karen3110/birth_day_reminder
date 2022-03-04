package com.birthdays.birthdayapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        long d = 0;
        try {
            d = new SimpleDateFormat("dd/MM/yyyy").parse("31/10/1999").getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }


        System.out.println();
    }

}
