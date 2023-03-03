package Exercises;

import java.util.Scanner;

public class Practice2 {
    public static int countDigits(int n){
        int cnt = 0;
        n = Math.abs(n);

        while (n > 0) {
            n = n / 10;
            cnt++;
        }
        return cnt;
    }




    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int integer = num.nextInt();

        System.out.println(countDigits(integer));
    }
}
