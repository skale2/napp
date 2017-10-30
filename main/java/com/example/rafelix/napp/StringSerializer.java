package com.example.rafelix.napp;


/**
 * Created by sohamkale on 10/7/17.
 */

public class StringSerializer {
    public static String[] serialize(String input) {
        String[] split = input.split("T");
        String date = split[0];

        String time = split[1].split("-")[0];
        String timeZone = split[1].split("-")[1];

        String[] ret = {date, time, timeZone};
        return ret;
    }

    public static int[] date(String input) {
        String date = serialize(input)[0];
        String[] dates = date.split("-");

        assert dates.length == 3;
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);

        int[] ret = {year, month, day};
        return ret;
    }

    public static int[] time(String input) {
        String time = serialize(input)[1];
        String[] times = time.split(":");

        assert times.length == 3;
        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);

        int[] ret = {hour, minute};
        return ret;
    }

    public static int getNearest15(int minutes){
        int mod = minutes % 15;
        int res;
        if(mod >= 8) { res = minutes + (15 - mod);  }
        else { res = minutes - mod;  }
        return (res % 60);
    }
}

