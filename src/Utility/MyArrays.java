package Utility;

import java.util.Arrays;

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

    // function that return the
    // largest value of an array
    public static double max(double [] values){
        // look for largest current value
        double largest = values[0];
        largest = Double.NEGATIVE_INFINITY;
        for (double v : values){
            if (v > largest){
                largest = v;
            }
        }
        return largest;
    }

    // function that returns the
    // smallest value of an array
    public static double min(double [] values){
        double smallest = values[0];
        // look for smallest current value
        smallest = Double.POSITIVE_INFINITY;
        for (double v: values){
            if (v < smallest) {
                smallest = v;
            }
        }
        return smallest;
    }


    // function that returns the
    // median value of an array
    public static double median(double [] values){
        Arrays.sort(values);

        if (values.length % 2 == 1){
            return values[values.length / 2];
        }
        else{
            return (values[values.length / 2 ] + values[values.length / 2 - 1]) / 2;
        }
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

