package Exercises;

import java.util.Random;
import java.util.Arrays;

public class Practice4 {
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    public static void main(String[] args) {
        int [] a = {2,4,6};
        System.out.println(banana((a)));
    }
}
