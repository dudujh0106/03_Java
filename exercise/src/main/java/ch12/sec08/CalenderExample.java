package ch12.sec08;

import java.util.*;

public class CalenderExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "년 " + month + "월 " + day + "일");

        int week = cal.get(Calendar.DAY_OF_WEEK);
        String weekStr = "";
        switch (week) {
            case Calendar.MONDAY: weekStr = "월"; break;
            case Calendar.TUESDAY: weekStr = "화"; break;
            case Calendar.WEDNESDAY: weekStr = "수"; break;
            case Calendar.THURSDAY: weekStr = "목"; break;
            case Calendar.FRIDAY: weekStr = "금"; break;
            case Calendar.SATURDAY: weekStr = "토"; break;
            case Calendar.SUNDAY: weekStr = "일"; break;
        }

        int amPm = cal.get(Calendar.AM_PM);
        String amPmStr = "오전";
        if (amPm == Calendar.PM) {
            amPmStr = "오후";
        }

        System.out.println(weekStr + "요일 " + amPmStr);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
