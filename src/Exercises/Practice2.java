package Exercises;

import java.lang.reflect.Array;
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

    public static void exchange(String [] arr, int i, int j ){
        String f = arr[i];
        String g = arr[j];

        arr[j] = f;
        arr[i] = g;

        System.out.println(arr[i]);
        System.out.println(arr[i]);

    }

    public static int largest(String [] words){
        int large = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].compareTo(words[large]) > 0) {
                large = i;
            }
        }


        return large;
    }




    public static void main(String[] args) {
        //Scanner num = new Scanner(System.in);

        //System.out.print("Enter a number: ");
        //int integer = num.nextInt();

        //System.out.println(countDigits(integer));

        //String s = "abcdefghijklmnopqrstuvwxyz";

        String [] array = new String [] {"Happy", "birthday", "To", "Ya"};
        exchange(array,0,3);

       // String s = "bumfuzzle";
       // System.out.println(s.substring(s.indexOf('u'), s.indexOf('z') + 1));

        //char ch = 'g';
        //ch = (char) ((ch - 'a') + 'A');
        //System.out.println(ch);

        //System.out.println(-22 % 9);
        //System.out.println(15 % -7);
        //System.out.println(Math.floorDiv(-24,5));
        //System.out.println(Math.floorMod(-33,6));

        String [] words = new String [] {"pyton", "java", "ada", "swift"};
        System.out.println(largest(words));
        System.out.println(largest(words));




    }
}
