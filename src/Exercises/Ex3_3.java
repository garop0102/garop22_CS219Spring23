package Exercises;
import java.util.Scanner;

public class Ex3_3 {
    // problem exercise for chapter 3 question 3.

    public static void main(String[] args) {
       Scanner secs = new Scanner(System.in);

       // prompt user for input
        System.out.print("Enter the total number " +
                "of seconds: ");
        // reads integer from keyboard
        int seconds = secs.nextInt();

        // calculates the result
        int hour = seconds / 3600;
        int minute = (seconds / 60) % 60;
        int seconds_2 = seconds % 60;

        // display
        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds",
                seconds,hour,minute, seconds_2);

    }
}
