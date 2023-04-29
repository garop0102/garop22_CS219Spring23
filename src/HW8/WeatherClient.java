package HW8;

import Utility.Util;
import ZipCodes.ZipCode;


import java.util.*;
public class WeatherClient implements WeatherClientInterface {
    @Override
    public WeatherObservation getWeather(ZipCode code) {
        final String URL = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&" +
              "lat=%s&lng=%s&username=edharcourt";
        String lng = code.getCoord().toString().substring(15,21);
        String lat = code.getCoord().toString().substring(31,38);

        String val = String.format(URL, lat,lng);

        Scanner s = Util.openSite(val);
        double temp = 0;
        String windspeed = null;
        String humidity = null;
        String cloud = null;

        // if code doesn't properly read the text file.
        if (s == null){
            System.out.println("Error: couldn't open site. ");
            return null;
        }

        // plow through the text file
        while (s.hasNextLine()){
            String line =  s.nextLine();
            if (!line.contains("cloudsCode") && line.contains("clouds"))
                cloud = line.substring(line.indexOf("",12),line.length() - 1);
            if (line.contains("temperature")) {
                temp = Double.parseDouble(line.substring(18,line.length() - 2));
                temp = Double.parseDouble(String.valueOf(temp = ((9.0 / 5.0) * temp) + 32));
            }
            if (line.contains("humidity"))
                humidity = line.substring(line.indexOf("",14),16);
            if (line.contains("windSpeed")) {
                windspeed = line.substring(line.indexOf("",16),18);
            }
        }

        String city = code.getCity();
        String state = code.getState();


        return new WeatherObservation(temp,windspeed,humidity,cloud,city,state);
    }


}

