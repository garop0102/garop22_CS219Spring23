package HW2;

import java.util.Scanner;


public class DayOfWeek {

    public static int dayofweek(int month, int day, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + 31 * m0 / 12) % 7;

    }

    public static void main(String[] args) {
        int month, day, year;
        Scanner date = new Scanner(System.in);

        System.out.print("Enter the month: ");
        month = date.nextInt();

        System.out.print("Enter the day: ");
        day = date.nextInt();

        System.out.print("Enter the year: ");
        year = date.nextInt();

        System.out.println(dayofweek(month,day,year));
    }

}
