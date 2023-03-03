package Exercises;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //prompts user to enter a number
        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        //checks if the input is an odd number
        if (N % 2 != 0){
            System.out.println("Weird");
        }

        //otherwise, checks if the input is in the range
        //of 2 to 5
        else if (2 <= N && N <= 5){
            System.out.println("Not Weird");
        }

        //otherwise, checks if the input is in the
        //range of 6 to 20
        else if (6 <= N && N <= 20){
            System.out.println("Weird");
        }

        //finally, checks if the input is even and
        //also greater than 20
        else {
            if (N > 20) {
                System.out.println("Not Weird");
            }
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
