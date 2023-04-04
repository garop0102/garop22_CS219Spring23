package Recursion;

import Utility.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class Examples {
    public static int sod(int n) {
        if (n == 0)
            return 0;
        else
            return sod(n/10) + n % 10;
    }

    public static long pow(int x, int y) {
        if (y == 0)
            return 1;
        else if (y % 2 == 0){
            return (long) Math.pow(pow(x,y/2), 2);
    }
        else
            return pow(x,y - 1) * x;
    }


    // Study: modify to be more general
    // to count the number of times the
    // digits appears in n.
    public static int count7s(int n){
        if (n == 0)
            return 0;

        else if (n % 10 == 7)
            return count7s(n/10) + 1;

        else
            return count7s(n/10);


    }

    public static String reverse(String s){
        if (s.isEmpty())
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);

    }

    // Swap items at indexes i and j
    public static void swap(ArrayList<String> arr, int i ,int j ){
        String t = arr.get(j);
        arr.set(j, arr.get(i));
        arr.set(i,t);
    }



    // reverse the array list between the region
    // left and right (inclusive)
    // 0 <= left < arr.size()
    // 0 <= right < arr.size()
    public static void reverse(ArrayList<String> arr, int left, int right){

        if (left < right){
            swap(arr, left,right);
            reverse(arr, left + 1, right - 1);
        }
    }


    //return a copy of ,s, with all of the spaces
    //removed.
    //for example, remove spaces  of ("able was I")
    // is equal ot "ablewasI".
    //TODO draw the runtime stack for the removeSpaces("able was I")

    public static String removeSpaces(String s){
        if (s.isEmpty())
            return "";
        else if (s.charAt(0) == ' ')
            return removeSpaces(s.substring(1));

        else
            return s.charAt(0) + removeSpaces(s.substring(1));
    }

    public static String toBinary(int n){
        if (n == 0)
            return "0";
        else
            return toBinary(n / 2) + n % 2;

    }

    public static int bsearch( ArrayList<String> arr, String key, int left, int right){
        if (left > right)
            return -1;

        int mid = (left + right) / 2;

        if (arr.get(mid).equals(key))
            return mid;

        else if (arr.get(mid).compareTo(key) < 0)
            return bsearch(arr, key, mid + 1, right);

        else
            return bsearch(arr,key,left,mid - 1);
    }


    public static void main(String[] args) {
        System.out.println(sod(45193) == 22);

        System.out.println("Recursive Test.");
        System.out.println();
        System.out.println(pow(2,10) == 1024);
        System.out.println(pow(3,5));
        System.out.println(pow(10,63));

        System.out.println(count7s(70773));

        System.out.println(reverse("abcde").equals("edcba"));

        System.out.println(removeSpaces("a bc"));
        System.out.println(removeSpaces(" abc"));
        System.out.println(removeSpaces("    b    c   a"));

        System.out.println(toBinary(31));
        System.out.println(toBinary(417997));

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Mango");
        System.out.println(bsearch(fruit,"Mango", 0, fruit.size()) - 1);

        reverse(fruit,0, fruit.size() - 1);
        System.out.println(fruit);

        // test binary search on a large list of words
        Scanner s = Util.openSite("http://10.60.15.25/~ehar/cs219/words-big.txt");
        ArrayList<String> words = new ArrayList<>();
        while (s.hasNextLine())
            words.add(s.nextLine().strip().toLowerCase());

        System.out.println(words.size());

        System.out.println(bsearch(words, "abib", 0, words.size() - 1));





    }

}

