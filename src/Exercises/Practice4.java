package Exercises;

import Utility.MyArrays;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice4 {


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

    public int[] swapEnds(int[] nums) {
        nums[0] = nums[nums.length-1];


        return nums;
    }
    public static boolean areFactors(int n, int [] array){
        for (int num : array)
            if (num % n != 0)
                return false;
        return true;
    }

    public static boolean hasDuplicate2(String [] s){
        for (int i = 0; i < s.length; i++){
            s[i] = s[i].toLowerCase();
            for (int j = 0; j < s.length; j++){
                s[j] = s[j].toLowerCase();
                if (i != j)
                    if (s[i].equals(s[j]))
                        return true;
            }
        }
        return false;
    }



    //modifies the list by placing a "*" element between elements
    public static void addStars(ArrayList<String> s){
        for (int i = s.size() - 1; i >= 0; i--){ // looks at the arraylist, starting from the end
            String n = s.get(0); // declares first element of the array list
            s.remove(n); // removes the first element
            s.add("*"); // adds a star to the end of the arraylist
            s.add(n); // adds the previously removed element back to the arraylist,
                      // this time it lies at the end of the arraylist.
        }
        System.out.println(s + "\t");
    }

    //returns the number of elements in the list within a specified range
    public static int countInRange(ArrayList<Integer> n, int min, int max){
        int count = 0;
        for (int num : n) { // looks at every number in the arraylist
            if (num >= min && num <= max) // determines if the number lies in the range
                count++; // adds one to the count
        }
        return count;
    }


    public static void main(String[] args) {
        //String [] aos = {"Harry", "Mary", "Larry", "Gerry", "Terry", "John"};

        //int[] bob = make(5);
        //dub(bob);
        //System.out.println(mus(bob));


        //int [] a = {2,4,6,8,10};
        //System.out.println(areFactors(2,a));

       // System.out.println(hasDuplicate2(aos));

        ArrayList<String> word = new ArrayList<>();
        word.add("Hello");
        word.add("There");
        word.add("How");
        word.add("Are");
        word.add("You?");

        addStars(word);



    }

}
