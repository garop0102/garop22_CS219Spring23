package Exercises;

import java.util.Scanner;

public class Exam1Study2 {

    public static double volume(double r, double h) {
        return (1.0 / 3.0) * Math.PI * (Math.pow(r, 2.0)) * h;
    }

    public static double getValidRadius() {
        Scanner vol = new Scanner(System.in);

        boolean flag = true;
        while (true) {
            System.out.print("Enter the radius: ");
            if (!vol.hasNextDouble()) {
                String word = vol.next();
                System.out.println("Error. Expected value should be an integer. You " +
                        "entered " + word);
            } else {
                double r = vol.nextDouble();
                if (r < 0) {
                    System.out.println("Error. Expected value should be greater than zero");
                } else {
                    flag = false;
                    return r;
                }
            }
        }
    }

    public static double getValidHeight () {
        Scanner vol = new Scanner(System.in);

        boolean flag = true;

        while (true) {
            System.out.print("Enter the height: ");
            if (!vol.hasNextDouble()) {
                String word = vol.next();
                System.out.println("Error. Expected value should be an integer. You " +
                        "entered " + word);
            } else {
                double h = vol.nextDouble();
                if (h < 0) {
                    System.out.println("Error. Expected value should be greater than zero");
                } else {
                    flag = false;
                    return h;
                }
            }
        }
    }



    public static void main(String[] args) {
        double r = getValidRadius();
        double h = getValidHeight();

        System.out.printf("The volume is %.2f", volume(r,h));
    }
}