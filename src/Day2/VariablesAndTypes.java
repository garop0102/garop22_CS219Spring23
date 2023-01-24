package Day2;

public class VariablesAndTypes {

    public static double f2c(double f) {
        return 5.0/9.0 * (f-32);
    }


    /**
     *
     * @param c - initial investment
     * @param r - yearly rate
     * @param t - number of years
     * @param n - number of times of compound per year
     * @return - the final value of the investment
     */
    public static double investment(double c, double r, int t, double n) {
        return c * Math.pow(1+r/n, n*t);


    }



    //main is the name of a function
    //void is the return type
    public static void main(String[] args) {
        System.out.println(f2c(212));
        System.out.println(investment(1,1,1,1e9));

        int x = 7;
        System.out.println(x*x);
        x = 8;

        float e = 2.7182F; // don't use floats.
        double pi = 3.14159; // double precision

        // double electron_mass =
        // .0000000000000000000000000000000000091093837105;
        final double electron_mass = 9.109e-31;
        //electron_mass = 78;  *error

        //Avagadro's number = 6.0221408e+23
        final double Avagadros_number = 6.0221408000000000000000;
    }
}

