package SwallowSpeeds;

import Utility.MyArrays;
import Utility.Util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     *
     * @param s - Must be a properly constructed scanner
     *          and in particular, NOT NULL!
     */


    // function that takes scanner as a
    // parameter and just prints the site
    // to the console
    public static void show(Scanner s){
        while (s.hasNextLine()){
            System.out.println(s.nextLine());
        }
    }


    public static ArrayList<Double> loadSpeeds1(Scanner s) {
        ArrayList<Double> speeds = new ArrayList<>();

        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (line.indexOf('#') == -1 &&
                    !line.isBlank()) {

                // the add function in an array list adds
                // the item to the end of the array list.
                speeds.add(Double.parseDouble(line));
            }
        }
        return speeds;
    }



    // function that stores data in an array
    // will return the array that was constructed
    // from the file of doubles
    public static double [] loadSpeeds(Scanner s){
        // define an array of doubles
        // this type is a primitive array.

        // primitive array: means we have to
        // exactly how many items it needs
        // when we declare it.
        double [] speeds = new double[18];

        // website states it only wants
        // values that don't have a #
        // next to them
        int i = 0;
        while (s.hasNextLine()){
            String line = s.nextLine();
            if (line.indexOf('#') == -1 && !line.isBlank()){
                speeds[i] = Double.parseDouble(line);
                i++;
            }
        }
        return speeds;
    }



    public static void main(String[] args) {
        // url for website
        String path =
                "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";
        // have to capture value for function
        // since it returns a scanner
        Scanner s = Util.openSite(path);

        if (s != null) {
            double[] vec = loadSpeeds(s);
            System.out.println(Arrays.toString(vec));
            MyArrays.printDoubles(vec);
            System.out.println(MyArrays.mean(vec));

            // test for mean function
            System.out.println(MyArrays.mean(
                    // this is an example of
                    // an array literal syntax
                    new double[] {1.0, 2.0, 3.0, 4.0}
            ) == 2.5);

            // test for minimum value of array
            System.out.println(MyArrays.min(
                    new double[] {1.0, 2.0, 3.0, 4.0}
            ) == 1.0);

            // test for maximum value of array
            System.out.println(MyArrays.max(
                    // this is an example of
                    // an array literal syntax
                    new double[] {1.0, 2.0, 3.0, 4.0}
            ) == 4.0);

            // test for median value of an array
            System.out.println(MyArrays.median(vec));
            MyArrays.printDoubles(vec);

            // Use new version of loadSpeeds that uses ArrayList
            Scanner s1 = Util.openSite(path);
            ArrayList<Double> speeds = loadSpeeds1(s1);
            System.out.println("DEBUG " + speeds.size());
            MyArrays.printdoubles(speeds);
        }
    }


}
