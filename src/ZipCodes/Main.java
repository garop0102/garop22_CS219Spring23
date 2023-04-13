package ZipCodes;

public class Main {
    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(10,20);
        Coordinate c2 = new Coordinate(20,30);

        System.out.println(c1.dist(c2));

        // create zipcode object for Canton.
        ZipCode z1 = new ZipCode("13617", "NY", "Canton",
                new Coordinate(75.1,44.6));

        ZipCode z2 = new ZipCode("13676", "NY", "Potsdam",
                new Coordinate(74.9,44.6));

        System.out.println(z1.getCoord()
                .dist(z2.getCoord()));
        System.out.println(z1.dist(z2));

        // create ZipCodeDB object.
        ZipCodeDB db = new ZipCodeDB();
        db.load();
    }
}
