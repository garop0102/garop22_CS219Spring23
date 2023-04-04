package Exercises;


import java.util.Scanner;


public class Practice1 {
    public static boolean threeConsecutive(int f,int s, int t){
        if (f - s != 1 && s - t != 1 && t - s != 1 && s - f != 1) {
            return false;
        }
        else {
            return true;
        }
    }
    public static int maxInRange(int [] arr, int lowIndex, int highIndex){
        int largest = 0;
        if (arr[lowIndex] == arr[highIndex])
            return arr[lowIndex];
        else {
            return maxInRange(arr,lowIndex + 1,highIndex) + largest;

        }

    }





    public static void beerLyrics(int n){
        if (n == 0)
            System.out.println("""
                    No bottles of beer on the wall,
                    no bottles of beer,
                    ya’ can’t take one down, ya’ can’t pass it around,
                    ’cause there are no more bottles of beer on the wall!""");
        else{
            System.out.printf("""
                    %d bottles of beer on the wall,
                    %d bottles of beer,
                    ya’ take one down, ya’ pass it around,
                    %d bottles of beer on the wall.
                    """, n , n, n - 1);
            System.out.println();
            beerLyrics(n - 1);
        }

    }

    public static int oddSum(int n){
        if (n == 0)
            return 0;
        int recurse = oddSum(n - 1);
        if (n % 2 != 0)
            return n + recurse;
        else
            return recurse;
    }
    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return n * prod(m, n -1);
        }
    }

    public static int ack(int m, int n){
        if (m < 0 || n < 0)
            return 0;
        if (m == 0)
            return n + 1;
        if (n == 0)
            return ack(m - 1, 1);
        else
            return ack(m -  1, ack(m , n - 1));

    }




    public static void main(String[] args) {
        //Scanner num = new Scanner(System.in);

        //System.out.print("Enter an integer: ");
        //int f = num.nextInt();

        //System.out.print("Enter an integer: ");
        //int s = num.nextInt();

        //System.out.print("Enter an integer: ");
        //int t = num.nextInt();

        //System.out.println(threeConsecutive(f,s,t));

        //beerLyrics(50);

        //System.out.println(oddSum(10));

        //System.out.println(prod(1,4));

        //System.out.println(ack(2,4));

        int [] array = new int [] {2,10,4,50,0,8,9,20,30,40};

        System.out.println(maxInRange(array,3,6));



    }




}
