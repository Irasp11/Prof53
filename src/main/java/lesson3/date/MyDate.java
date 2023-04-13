package lesson3.date;

public class MyDate {
    private int year, month, day;

    // можно сделать month через enum

    // добавить конструкторы геттеры сеттеры

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // добавить функицю
    void add(int days) {
        while (days > 0) {
            int daysInMonth = getDaysInMonth(year, month);
            int daysLeftInMonth = daysInMonth - day + 1;

            if (daysLeftInMonth <= days) {
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
                day = 1;
                days -= daysLeftInMonth;
            } else {
                day += days;
                if (day > daysInMonth) {
                    day = 1;
                    month++;
                    if (month > 12) {
                        month = 1;
                        year++;
                    }
                }
                days = 0;
            }
        }
    }

    int getDaysInMonth(int year, int month) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if ((month <= 7 && month % 2 == 1) || (month > 7 && month % 2 == 0)) {
            return 31;
        } else {
            return 30;
        }
    }

    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}