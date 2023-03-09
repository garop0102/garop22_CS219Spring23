package Utility;

public class MyArrays {
    // function that returns the mean
    // value of an array
    public static double mean(double [] values){
        double total = 0;
        for (double value: values){
            total = total + value;
        }
        return total/ values.length;
    }






    // function that prints out the arrays
    public static void printDoubles(double [] values){
        System.out.print('[');
        for (int i = 0; i < values.length - 1; i++){
            System.out.print(values[i] + ", ");
        }
        System.out.print(values[values.length - 1]);
        System.out.println(']');
    }
} // class MyArrays

