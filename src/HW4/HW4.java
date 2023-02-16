package HW4;

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
                    System.out.println("Error: initial deposit should be" +
                            "greater than zero. You entered " + num);
                } else {
                    return num;
                }
            }
        }
    }


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



    public static void main(String[] args) {
        System.out.println(getValidInvestment());
        System.out.println(getValidInterestRate());
        System.out.println(getValidNumberOfYears());
        System.out.println(getValidCompound());

    }

}

