package OOP;

public class Main {

    public static void main(String[] args) {
        Particle p1 = new Particle(3.2,34.5,2.0,-1.9);
        Particle p2 = new Particle(43.2,77.9,-1.2,2.3);

        // to modify p1's x coordinate
        // p1.x = 7; // however, this is NOT best practice

        System.out.println(p2.getX());

        // println automatically calls
        // the toString method.
        System.out.println(p1);
        p1.move();
        p2.move();
        System.out.println(p1);

        System.out.println(p1.origin());
        System.out.println(p1.dist(p2));
        System.out.println(p2.dist(p1));
        System.out.println(p2.dist(p2));


    }
}
