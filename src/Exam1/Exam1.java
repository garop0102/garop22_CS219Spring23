package Exam1;

import java.util.Scanner;

public class Exam1 {
    public static int printTriangle(int n) {
        char stars = '*';
        int sum = 0;
        int i = 0;
        int j = 0;

        if (n > 0) {
            for (i = 0; i < n; i++) {
                System.out.println(stars);
                for (j = 0; j < i; j++) {
                    System.out.print(stars);
                }
                System.out.print(stars);
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        System.out.println(printTriangle(num.nextInt()));

        }
    }
