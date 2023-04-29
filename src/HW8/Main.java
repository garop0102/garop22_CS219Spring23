package HW8;

import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        prompt();
    }





    public static void errorCheck (String s){
        System.out.printf("""
                Error: zip code %s not found.
                Error: Enter a valid zip code
                """, s);
        System.exit(0);
    }
    public static void prompt(){
        System.out.println("Type \"quit\" to end the program.");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a zipcode> ");
        String zip = obj.nextLine();

        while (!zip.equals("quit")){
            ZipCodeDB db = new ZipCodeDB();
            db.load();
            ZipCode zip2 = db.findByZip(zip);
            if (zip2 == null) {
                errorCheck(zip);
            }
            else {
                WeatherClientInterface zipcode = new WeatherClient();
                System.out.println(zipcode.getWeather(zip2));
                break;
            }
        }
    }
}
