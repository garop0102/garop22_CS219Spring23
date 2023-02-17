package Utilitiy;

public class Util {
    /**
 *
 * @param c - initial investment
 * @param r - yearly rate
 * @param t - number of years
 * @param n - number of times of compound per year
 * @return - the final value of the investment
 */
public static double investment(double c, double r, double t, int n) {
    return c * Math.pow(1+r/n, n*t);


}
    public static double f2c(double f) {
        return 5.0/9.0 * (f-32);
    }
    /**
     * @param t - temperature in F
     * @param v - wind velocity in MPH
     * @return - Windchill in F
     */
    public static double windchill(double t, double v) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }







}
