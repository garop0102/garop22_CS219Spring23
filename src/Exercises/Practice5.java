package Exercises;

import Utility.Util;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Practice5 {
    public static void srt(String [] arr){


    }
    public static char firstletter(String s){
        return s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner s = Util.openSite("http://10.60.15.25/~ehar/cs219/words-big.txt");
        ArrayList<String> words = new ArrayList<>();
        while (s.hasNextLine())
            words.add(s.nextLine().strip().toLowerCase());

    }
}
