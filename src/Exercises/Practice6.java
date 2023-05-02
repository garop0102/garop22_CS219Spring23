package Exercises;

public class Practice6 {
    public static int evenDigits(int n){
        //base case
        if (n == 0)
            return 0;
        //extracts last digit of n
        //and if that digit is even
        //then it will call the evenDigits function recursively
        else if ((n % 10) % 2 == 0){
            //the times 10 creates space for the digit and then appends the digit
            return evenDigits(n / 10) * 10 + n % 10;
        }
        else
            //if the digit is not even the function will just call
            //evenDigits recursively.
            return evenDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(evenDigits(8342116));

    }
}
