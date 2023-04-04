package Exercises;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.random.*;

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



    //if __name__ == '__main__':
      //      # Load palindrome words and print in reverse alphabetical order
        //    palindrome_words = Exam.load_words()
    //palindrome_words.sort(reverse=True)
    //print(palindrome_words)


    public static String jumble(String word) {
        // Convert the word to an array of characters
        char[] chars = word.toCharArray();
        // Shuffle the array using the Fisher-Yates shuffle algorithm
        //Random rand = new Random();
        for (int i = chars.length - 1; i > 0; i--) {
           // int j = rand.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        // Convert the shuffled array back to a string
        return new String(chars);
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
