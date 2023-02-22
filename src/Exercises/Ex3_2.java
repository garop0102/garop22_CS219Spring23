package Exercises;

import java.util.Scanner;
public class Ex3_2 {
    // problem exercise for chapter 3 question 2.
    public static void main(String[] args) {
        Scanner celsius = new Scanner(System.in);

        // prompt user for input
        System.out.print("Enter a temperature in Celsius: ");
        // reads a double value from keyboard
        double c = celsius.nextDouble();

        // calculates the result
        double f = c * (9.0/5.0) + 32;
        // formats to one decimal place
        System.out.printf("%.1f C = %.1f F",c,f);



    }

}
