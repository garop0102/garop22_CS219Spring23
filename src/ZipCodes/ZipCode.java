package ZipCodes;

import org.jetbrains.annotations.NotNull;

public class ZipCode implements Comparable<ZipCode>{
    private String code; // the zipcode
    private String state; // the two char state code
    private String city; // the city name
    private Coordinate coord; // longitude and latitude

    public ZipCode(String code, String state, String city, Coordinate coord) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.coord = coord;
    }

    public ZipCode(String code, String state, String city, double lng, double lat) {
        // calls the constructor from above
        this(code, state, city, new Coordinate(lng, lat));

    }

    public String getCode() {
        return code;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public Coordinate getCoord() {
        return coord;
    }

    @Override
    public String toString() {
        return "ZipCode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", coord=" + coord +
                '}';
    }

    public double dist(ZipCode that) {
        return this.coord.dist(that.coord);
    }


    // TODO How do we order by the combination of the zipcode and the state?
    @Override
    public int compareTo(ZipCode that) {
        //return this.code.compareTo(that.code);
        //return this.city.compareTo(that.city);

        //returns -1,0,1, instead of true/false.
        if (this.coord.getLat() < that.coord.getLat())
            return 1;
        else if (this.coord.getLat() == that.coord.getLat())
            return 0;
        else
            return -1;
    }
}
