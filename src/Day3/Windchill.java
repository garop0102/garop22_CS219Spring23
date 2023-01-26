package Day3;

import Utilitiy.Util;

import java.util.Scanner;

public class Windchill {

    public static void main(String[] args) {

        // Read the temperature and wind velocity from the user
        Scanner kbd = new Scanner(System.in);

        // prompt for and then read the temperature
        System.out.print("Enter a temp (F): ");
        double temp = kbd.nextDouble();

        // prompt for and then read the velocity
        System.out.print("Enter a velocity (MPH): ");
        double vel = kbd.nextDouble();

        // formatted print
        System.out.printf("The windchill is %.1f for a temperature of %.1f and a wind velocity of %.1f\n", Util.windchill(temp,vel), temp, vel);
    }
}
