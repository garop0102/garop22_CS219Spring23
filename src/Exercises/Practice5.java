package Exercises;

import Utility.Util;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice5 {
    public static String crazyCaps(String s){
        for (int i = 0; i < s.length(); i++){
            char ch = (char) ((s.charAt(i) + 'a') - 'A');
            if (s.indexOf(s.charAt(i)) % 2 == 0){
                ch = s.charAt(i);
            }
        }


        return s;
    }




    public static char firstletter(String s){
        return s.charAt(0);
    }

    public static void main(String[] args) {
        //Scanner s = Util.openSite("http://10.60.15.25/~ehar/cs219/words-big.txt");
        //ArrayList<String> words = new ArrayList<>();
        //while (s.hasNextLine())
            //words.add(s.nextLine().strip().toLowerCase());
        System.out.println(crazyCaps("HelloThereWorld."));

    }

}
