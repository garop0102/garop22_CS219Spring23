package OOP;


// This class is going to contain the
// properties of 1 particle.
public class Particle {


    // Non-static variables declared
    // in a class. Is called
    // instance data
    private double x,y,dx,dy;

    // This is the constructor function.
    public Particle(double x, double y, double dx, double dy) {

        // keyword "this" refers
        // to the object that
        // was used on the left
        // hand side of the dot.
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;

    }

    // getter method for x
    public double getX(){
        return this.x;
    }

    public double getY() {
        return y;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    // the toString method converts the
    // object's state to a string,
    // suitable for human reading (i.e., like printing)


    // @Override is a IntelliJ extension
    // indicating that the toString method
    // is overriding the toString method in the base class.
    public String toString() {
        return "Particle{" +
                "x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }

    public void move(){
        x = x + dx;
        y = y + dy;

    }

    public double origin(){
        return Math.sqrt(x*x + y*y);
    }

    public double dist(Particle p){
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }
}
