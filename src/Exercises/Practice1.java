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


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int f = num.nextInt();

        System.out.print("Enter an integer: ");
        int s = num.nextInt();

        System.out.print("Enter an integer: ");
        int t = num.nextInt();

        System.out.println(threeConsecutive(f,s,t));


    }




}
