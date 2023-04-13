package ZipCodes;

public class Coordinate {
    private double lng,lat;

    public Coordinate(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "lng=" + lng +
                ", lat=" + lat +
                '}';
    }

    public double getLng() {
        return lng;
    }

    public double getLat() {
        return lat;
    }

    public double dist(Coordinate that){
        return 3958.80 * Math.acos(Math.cos(this.lat) * Math.cos(that.lat)
                * Math.cos(this.lng - that.lng) + Math.sin(this.lat) * Math.sin(that.lat));
    }
}
