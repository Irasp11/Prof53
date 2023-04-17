package lesson3.weekdays;
import java.util.Arrays;

enum Day {
    WORKDAY,
    WEEKEND
}
public enum WeekDays {
    MONDAY(Day.WORKDAY),
    TUESDAY(Day.WORKDAY),
    WEDNESDAY(Day.WORKDAY),
    THURSDAY(Day.WORKDAY),
    FRIDAY(Day.WORKDAY),
    SATURDAY(Day.WEEKEND),
    SUNDAY(Day.WEEKEND);

    private final Day day;

    private WeekDays(final Day day) {
        this.day = day;
    }

    public Day getDay() {
        return day;
    }

    public static boolean isWorkday(String day) {
//        return this.day == Day.WORKDAY;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                return true;
        }
        return false;
    }

    public static boolean isWeekend(String day) {
//            return this.day == Day.WEEKEND;
        switch (day) {
            case "SATURDAY":
            case "SUNDAY":
                return true;
        }
        return false;
    }

// возвращать true если день с понедельника по пятницу включительно
// возвращать true если день суббота или воскресенье

    public static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(SUNDAY.ordinal()); // порядковый номер
        System.out.println(
                Arrays.toString(
                        WeekDays.values()
                )
        );
//
        WeekDays day = WeekDays.FRIDAY;
        WeekDays day1 = WeekDays.valueOf("WEDNESDAY");
////        day = WeekDays.valueOf("HELLO");
        System.out.println(WeekDays.valueOf("WEDNESDAY").ordinal());
        System.out.println(WeekDays.values()[2]);

        System.out.println(isWeekend(String.valueOf(FRIDAY)));
        System.out.println(isWeekend(String.valueOf(SUNDAY)));
//
    }
}

//public enum WeekDays {
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
//
//    public boolean isWorkDay() {
//        return this != SATURDAY && this != SUNDAY;
//    }
//
//    public boolean isWeekEnd() {
//        return this == SATURDAY || this == SUNDAY;
//    }
//}