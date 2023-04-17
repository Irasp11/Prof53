package lesson3.weekdays;

import lesson3.date.MyDate;

public class Main {
    public static void main(String[] args) {

        System.out.println(WeekDays.FRIDAY.getDay());

//        String day = "SUNDAY";
        String day = WeekDays.valueOf("SUNDAY").toString();
        System.out.println(WeekDays.isWorkday(day));
        System.out.println(WeekDays.isWeekend(day));

        WeekDays day1 = WeekDays.valueOf("WEDNESDAY");
////        day = WeekDays.valueOf("HELLO");
        System.out.println(WeekDays.valueOf("WEDNESDAY").ordinal());
        System.out.println(WeekDays.values()[2]);

//        MyDate date = new MyDate(2022, 9, 11);
//        date.add(17);

    }
}
