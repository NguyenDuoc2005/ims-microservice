package com.userservice.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateConverter {
    public static String convertDateToString(long dateInMillis) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd 'at' HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        String formattedDate = sdf.format(new Date(dateInMillis));
        return formattedDate;
    }

    public static String convertDateToStringMail(long dateInMillis) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm aa");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        String formattedDate = sdf.format(new Date(dateInMillis));
        return formattedDate;
    }

    public static String convertDateToStringTodo(Long timestamp) {
        Date date = new Date(timestamp);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd");
        String formattedTime = dateFormat.format(date);
        return formattedTime;
    }

    public static void main(String[] args) {
        long dateInMillis = new Date().getTime();
        String formattedDate = DateConverter.convertDateToString(dateInMillis);
        System.out.println(formattedDate);
    }
}
