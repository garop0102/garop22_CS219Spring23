package Exercises;

import Utility.MyArrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Practice4 {

    public static boolean hasDuplicate(String [] s){
        for (String ao : s){
            int count = 0;
            ao = ao.toLowerCase();
            for (int j = 0; j < s.length; j++){
                s[j] = s[j].toLowerCase();
                if (ao.equals(s[j]))
                    count++;
                if (count == 2)
                    return true;
            }
        }
        return false;
    }

    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;
    }

    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }

    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }
    public static boolean areFactors(int n, int [] array){
        for (int num : array)
            if (num % n != 0)
                return false;
        return true;
    }



    public static void main(String[] args) {
        String [] aos = {"Harry", "Mary", "Larry", "Gerry", "Terry", "mary"};
        System.out.println(hasDuplicate(aos));

        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));


        int [] a = {2,4,6,8,10};
        System.out.println(areFactors(2,a));



    }

}
