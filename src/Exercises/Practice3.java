package Exercises;

public class
Practice3 {

    //Returns the first character of the given String.
    public static char first(String s) {
        return s.charAt(0);
    }

    //Returns all but the first letter of the given String.
    public static String rest(String s) {
        return s.substring(1);
    }

    //Returns all but the first and last letter of the String.
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }


    //Returns the length of the given String.
    public static int length(String s) {
        return s.length();
    }

    //Prints each letter of a string on each new line.
    public static void printString(String s){
        if (s.equals(""))
            return;
        else {
            System.out.println(first(s));
            printString(s.substring(1));
        }

    }
    //Prints each letter of a string but backwards
    //on each new line.
    public static void printBackward(String s){
        if (s.equals(""))
            return;
        else {
            printBackward(s.substring(1));
            System.out.println(first(s));
        }
    }


    //Returns the string parameter but in reverse
    //on one single line.
    public static String reverseString(String s){
        if (s.isEmpty())
            return s;
        else
            return reverseString(s.substring(1)) + s.charAt(0);

    }
    //Returns the true or false if the string
    //is a palindrome
    public static boolean isPalindrome(String s){

        if (s.length() == 1)
            return true;
        else if (s.length() == 2 && s.charAt(0) == s.charAt(1))
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1,s.length() - 1));
        else
            return false;
    }

    //adds a "*" character whenever in between
    //two identical letters.
    public static String pairStar(String s){
        if (s.isEmpty() || s.length() == 1)
            return s;
        else if (s.charAt(0) == s.charAt(1))
            return s.charAt(0) + "*" + pairStar(s.substring(1));
        else
            return s.charAt(0) + pairStar(s.substring(1));
    }

    //Returns the number of times the recursive string
    //has the word "hi" in it.
    public static int countHi(String s){
        if (s.isEmpty() || s.length() == 1)
            return 0;
        else if (s.charAt(0) == 'h' && s.charAt(1) == 'i')
            return 1 + countHi(s.substring(1));
        else{
            return countHi(s.substring(1));
        }
    }




    public static void main(String[] args) {
        // tests for the methods above
        String input = "HelloThereSir";
        System.out.println(first(input));
        System.out.println(rest(input));
        System.out.println(middle(input));
        System.out.println(length(input));

        printString(input);
        printBackward(input);
        System.out.println(reverseString(input));

        System.out.println(isPalindrome("kayak"));

        System.out.println(pairStar(input));

        System.out.println(countHi("xxhixx"));
    }

}
