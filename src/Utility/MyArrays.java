package Utility;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrays {

    //function that shifts all the values of the
    //starting at index i, left by 1 place
    //filling in the last value as 0.
    public static int [] shift(int [] values, int i){
        for (int j = i; j < values.length - 1; j++){
            values[j] = values[j + 1];
        }
        //assigns 0 to end of array
        values[values.length - 1] = 0;
        return values;
    }






    public static int indexOf(int [] values, int key){
        for (int i = 0; i < values.length; i++){
            if (values [i] == key){
                return i;
            }
        }
        return -1;
    }

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
        double [] tmp = Arrays.copyOf(values, values.length);
        Arrays.sort(tmp);


        if (tmp.length % 2 == 1){
            return tmp[tmp.length / 2];
        }
        else{
            return (tmp[tmp.length / 2 ] + tmp[tmp.length / 2 - 1]) / 2;
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
        // printdoubles is *overloaded* there are multiple
    // version with different parameter types
    public static void printdoubles(ArrayList<Double> values) {
        System.out.print('[');
        for (int i = 0; i < values.size() - 1; i++)
            System.out.print(values.get(i) + ", ");
        System.out.print(values.get(values.size()-1));
        System.out.println(']');
    }





    // tests for the array functions
    public static void main(String[] args) {
        int [] array = {4,7,6,9,1,7};
        System.out.println(indexOf(array, 9) == 3);
        System.out.println(indexOf(array,43) == -1);
        System.out.println(indexOf(array,7) == 1);

        shift(array, 2);
        System.out.println(Arrays.toString(array)
                .equals(Arrays.toString(new int [] {4,7,9,1,7,0})));

        //compressed version of code above.
        System.out.println(Arrays.compare(array,new int [] {4,7,9,1,7,0}) == 0);

    }
} // class MyArrays

