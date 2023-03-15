package Exercises;

import Utility.MyArrays;

import java.util.Arrays;

public class Banish {
    public static void banish(int [] a1, int []a2){

// banish each item j in a2 from a1
        for (int j : a2) {
            while (true) {
                int loc = MyArrays.indexOf(a1, j);
                if (loc > -1)
                    MyArrays.shift(a1, loc);
                else
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
        int[] a2 = {42, 2222, 9};
        banish(a1, a2);
        int [] answer = {3, 0, 17, 8, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.equals(a1,answer));
    }

}

