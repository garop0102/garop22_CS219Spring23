package Exercises;

import java.util.Scanner;

public class Exam1StudyC2F {

    // function that takes a temperature in Celsius and returns Fahrenheit.
    public static double c2f(){
        Scanner cel = new Scanner(System.in);
        while (true){
            System.out.print("Enter the temp (c): ");

            // check if a string
            if (!cel.hasNextDouble()){
                String word = cel.next();
                System.out.print("Error. Integer is expected ");
                System.out.printf("you entered %s\n", word);
            }
            else {
                return ((9.0/5.0) * cel.nextDouble()) + 32;
            }
        }
    }

    public static void main(String[] args) {
        double celsius = c2f();

        System.out.println(celsius);

    }





}
