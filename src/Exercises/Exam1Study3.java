package Exercises;

import java.util.Scanner;
public class Exam1Study3 {
    public static int getPositiveInt() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive integer: ");
            if (s.hasNextInt()) {
                int x = s.nextInt();
                if (x > 0)      // make sure x is positive
                    return x;
                else
                    System.out.printf(
                            "Error: enter a positive integer, you entered \"%d\".\n",
                            x);
            }
            else {
                System.out.printf("Error: enter a positive integer, you entered" +
                        "\"%s\".\n", s.nextLine());
            }
        } // while
    } // getPositiveInt
    public static int countBetween(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (2 < digit && digit < 7)
                count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countBetween(getPositiveInt()));
    }
}

