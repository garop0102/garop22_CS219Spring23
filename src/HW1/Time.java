package HW1;

public class Time {

    public static int from_midnight(int h, int m, int s) {
        return (h * 3600) + (m * 60) + s;
    }
    public static int remaining(int h, int m, int s) {
        return ((24*3600) - ((h * 3600) + (m * 60) + (s)));
    }
    public static int percentage(int h, int m, int s) {
        return ((h * 3600) + (m * 60) + (s)) * 100 / (24*3600);
    }

    public static void main(String[] args) {
        int hour = 22;
        int minute = 4;
        int second = 20;

        System.out.println("Homework 1");

        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.print(" is ");
        System.out.print(from_midnight(22,4,20));
        System.out.println(" seconds since midnight.");

        System.out.print("There are ");
        System.out.print(remaining(22,4,20));
        System.out.println(" seconds remaining.");

        System.out.print(percentage(22, 4, 20));
        System.out.print("% of the day has elapsed.");
    }
}
