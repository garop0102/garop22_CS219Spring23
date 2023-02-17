package HW4;

import Utilitiy.Util;

import java.util.Scanner;

public class HW4 {

    // function for valid investment
    public static double getValidInvestment() {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Initial investment: ");

            // check if it is a string
            if(!in.hasNextDouble()){
                String word = in.next();
                System.out.print("Error: integer expected.");
                System.out.printf("You entered \"%s\"\n", word);
            } else {

                // check if it is greater than zero
                double num = in.nextDouble();
                if (num < 0) {
                    System.out.println("Error: initial deposit should be " +
                            "greater than zero. You entered " + num);
                } else {
                    return num;
                }
            }
        }
    }

    // function for valid interest rate
    public static double getValidInterestRate(){
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print("Interest rate: ");

            // check if it is a string
            if(!in.hasNextDouble()){
                String word = in.next();
                System.out.print("Error: number expected. ");
                System.out.printf("You entered \"%s\"\n", word);
            }
            else {
                // check if it is greater than zero
                double num = in.nextDouble();
                if (num < 0) {
                    System.out.println("Error: interest rate should be" +
                            "greater than zero. You entered " + num);
                }
                else {
                    return num;
                }
            }

        }
    }


    // function for valid
    // number of times compounded
    public static int getValidCompound(){
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print("Number of times compounded per year : ");

            // check if it is a string
                if(!in.hasNextInt()){
                String word = in.next();
                System.out.print("Error: number expected. ");
                System.out.printf("You entered \"%s\"\n", word);
            }
            else {
                // check if it is greater than zero
                int num = in.nextInt();
                if (num < 0) {
                    System.out.println("Error: number of times compounded should be " +
                            "greater than zero. You entered " + num);
                }
                else {
                    return num;
                }
            }

        }
    }
    // function for valid number of years
    public static double getValidNumberOfYears(){
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print("Number of years: ");

            // check if it is a string
            if(!in.hasNextDouble()){
                String word = in.next();
                System.out.print("Error: number expected. ");
                System.out.printf("You entered \"%s\"\n", word);
            }
            else {
                // check if it is greater than zero
                double num = in.nextDouble();
                if (num < 0) {
                    System.out.println("Error: number of years should be " +
                            "greater than zero. You entered " + num);
                }
                else {
                    return num;
                }
            }

        }

    }


    // call to validate functions
    public static void main(String[] args) {
        double investment = getValidInvestment();
        System.out.println("Initial investment: " + investment);

        double interest = getValidInterestRate();
        System.out.println("Interest rate: " + interest);

        double number_years = getValidNumberOfYears();
        System.out.println("Number of years of investment: " + number_years);

        int compound = getValidCompound();
        System.out.println("Number of times compounded per year: " + compound);

        // calculation for investment
        System.out.printf("%.2f", Util.investment(investment, interest,number_years,compound));

    }

}

