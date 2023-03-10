package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void printRange(int f, int s){
        if (f <= s){
            for (int i = f; i <= s; i++){
                System.out.printf("%d ", i);
            }
        }
        else {
            for (int i = f; i >= s; i--) {
                System.out.printf("%d ", i);
            }
        }

    }
    public static int numUnique(int one, int two, int three) {
        int count = 0;

        return count;
    }


    public static void main(String[] args) {
        System.out.println(numUnique(6,7,6));



    }

}
