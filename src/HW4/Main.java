package HW4;

import Utility.Util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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

    // function that stores data in an array
    // will return the array that was constructed
    // from the file of doubles
    public static double [] loadSpeeds(Scanner s){
        // define an array of doubles
        // this type is a primitive array.
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
        }
    }


}
