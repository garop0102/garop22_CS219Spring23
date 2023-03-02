package Exam1Corrected;

import java.util.Scanner;

public class Exam1REVISION {
    public static char printTriangle(int n) {
        char stars = '*';
        char ch = (char) (42);
        if (n > 0) {
            for (int i = 1; i < n; i++) {
                System.out.println(stars);
                for (int j = 0; j < i; j++) {
                    System.out.print(stars);
                }
            }
        }

        return ch;
    }





    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        boolean flag = true;

        while (flag){
            System.out.print("Enter an integer: ");

            if (num.hasNextInt()) {
                int integer = num.nextInt();
                if (integer < 0){
                    System.out.println("Error: Integer has to be " +
                            "greater than zero.");
                }
                else {
                    System.out.println(printTriangle(integer));
                    flag = false;
                }
            }
            else if (num.hasNext()){
                String word = num.next();
                System.out.printf("Error: Integer expected. You " +
                        "entered \"%s\"\n", word);
            }
        }
    }
}
