package HW8;

public class WeatherObservation {
    private double temp;
    private String wind;
    private String humidity;
    private String cloud;
    private String city;
    private String state;


    public WeatherObservation(double temp, String wind, String humidity,
                              String cloud, String city, String state) {
        this.temp = temp;
        this.wind = wind;
        this.humidity = humidity;
        this.cloud = cloud;
        this.city = city;
        this.state = state;
    }

    public double getTemp() {
        return temp;
    }

    public String getWindspeed() {
        return wind;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getCloud() {
        return cloud;
    }

    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }


    @Override
    public String toString() {
        return String.format("""
                The temperature in %s, %s is %s degrees fahrenheit
                Wind speed is %s knots, humidity percentage is %s
                Cloud cover: %s""",city,state,temp,wind,humidity,cloud);
    }


}
