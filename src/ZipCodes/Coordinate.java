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
        double x =
                Math.pow(
                        Math.sin(
                                Math.toRadians(
                                        this.lat - that.lat)/2), 2) +
                        Math.cos(Math.toRadians(that.lat)) *
                                Math.cos(Math.toRadians(this.lat)) *
                                Math.pow(
                                        Math.sin(
                                                Math.toRadians(
                                                        this.lng - that.lng)/2), 2);
        double y = 2*Math.atan2(Math.sqrt(x), Math.sqrt(1 -x));
        final int R = 6371000;
        return R * y / 1000;
    }
}
