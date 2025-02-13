package HW3;

public class HW3 {

    /**
     * codingbat.com/java
     * When squirrels get together for a party, they like to have cigars.
     * A squirrel party is successful when the number of cigars is between
     * 40 and 60, inclusive. Unless it is the weekend, in which case there
     * is no upper bound on the number of cigars. Return true if the
     * party with the given values is successful, or false otherwise
     * cigarParty(30, false) → false
     * cigarParty(50, false) → false
     * cigarParty(70, true) → true
     */

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (40 <= cigars && cigars <= 60) || (isWeekend && cigars >= 40);
    }

    /**
     * You are driving a little too fast, and a police officer stops you.
     * Fill in function below to compute the result, encoded as an int
     * value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is
     * 60 or less, the result is 0. If speed is between 61 and 80 inclusive,
     * the result is 1. If speed is 81 or more, the result is 2.
     * Unless it is your birthday -- on that day, your speed can be
     * 5 higher in all cases.
     * caughtSpeeding(60, false) → 0
     * caughtSpeeding(65, false) → 1
     * caughtSpeeding(65, true) → 0
     */

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public static boolean ordered(int d1, int d2, int d3) {
        if (d1 < d2) {
            if (d1 < d3) {
                if (d2 < d3) {
                    return true;
                }
            }
        }
        if (d3 < d2) {
            if (d3 < d1) {
                return d2 < d1;
            }
        }
        return false;
    }

    /**
     * The number 6 is a truly great number. Given two int values,
     * a and b, return true if either one is 6. Or if their sum or
     * difference is 6. Note: the function Math.abs(num) computes the
     * absolute value of a number.
     */
    public static boolean love6(int a, int b) {
        if (a == Math.abs(6) || b == Math.abs(6)) {
            return true;
        } else if (a + b == Math.abs(6))
            return true;
        else if (a - b == Math.abs(6) || b - a == Math.abs(6)) {
            return true;

        }
        {

        }
        return false; // fill in function body
    }

    /**
     * You have a lottery ticket with integers x, y, and x, each of which is
     * 0, 1, or 2. If they are all 2, your winnings are $10. Otherwise, if
     * they are all the same, your winnings are $5. Otherwise, so long as both
     * b and c are different from a, the result is $1. Otherwise, the result is $0.
     * redTicket(2, 2, 2) → 10
     * redTicket(2, 2, 1) → 0
     * redTicket(0, 0, 0) → 5
     */
    public static int redTicket(int a, int b, int c) {
        if (a == 2) {
            if (b == 2) {
                if (c == 2) {
                    return 10;
                }
            }
        }
        if (a == b) {
            if (b == c) {
                return 5;
            }
        }
        if (b == c) {
            return 1;

        }
        if (a == b) {
            return 0;
        }

        return -1;
    }

    /**
     * You have a blue lottery ticket, with ints a, b, and c on it.
     * This makes three pairs, which we'll call ab, bc, and ac. Consider the
     * sum of the numbers in each pair. If any pair sums to exactly 10,
     * the result is 10. Otherwise, if the ab sum is exactly 10 more than either
     * bc or ac sums, the result is 5. Otherwise, the result is 0.
     * blueTicket(9, 1, 0) → 10
     * blueTicket(9, 2, 0) → 0
     * blueTicket(6, 1, 4) → 10
     */
    public static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }
        if (ab == bc + 10 || ab == ac + 10) {
            return 5;
        } else
            return 0;

    }

    /**
     * Given two ints, each in the range 10..99, return true if there is a
     * digit that appears in both numbers, such as the 2 in 12 and 23.
     * Reminder: n/10, gives the left digit while the % "mod" n%10 gives
     * the right digit.
     * shareDigit(12, 23) → true
     * shareDigit(12, 43) → false
     * shareDigit(12, 44) → false
     */
    public static boolean commonDigit(int x, int y) {
        if (x >= 10 && x <= 99) {
            if (y >= 10 && y <= 99){
                if (x / 10 == y / 10 || x / 10 == y % 10) {
                    return true;
                }
                return x % 10 == y % 10 || x % 10 == y / 10;
        }

    }

        return false;
    }



    public static void main(String[] args) {
        // test cigarParty
        System.out.println(!cigarParty(30, false));
        System.out.println(cigarParty(50,false));
        System.out.println(cigarParty(70,true));
        System.out.println(!cigarParty(70,false));
        System.out.println(!cigarParty(30,true));// write some tests for your functions

        // test caughtSpeeding
        System.out.println(caughtSpeeding(50,false) == 0);
        System.out.println(caughtSpeeding(75,false) == 1);
        System.out.println(caughtSpeeding(85,false) == 2);
        System.out.println(caughtSpeeding(85,true) == 1);
        System.out.println();

        // test d1, d2, d3 order
        System.out.println("D1,D2,D3 TEST");
        System.out.println(ordered(1, 2, 3));
        System.out.println(ordered(3,2,1));
        System.out.println(ordered(5,2,1));
        System.out.println(ordered(4,20,100));

        // test love6
        System.out.println();
        System.out.println("Love6 TEST");
        System.out.println(love6(4,6));
        System.out.println(love6(6,2));
        System.out.println(love6(4,2));

        // test redTicket
        System.out.println();
        System.out.println("redTicket TEST");
        System.out.println(redTicket(2,2,2));
        System.out.println(redTicket(10,10,10));
        System.out.println(redTicket(70,2,2));
        System.out.println(redTicket(2,10,10));
        System.out.println(redTicket(2,2,10));

        // test blueTicket
        System.out.println();
        System.out.println("blueTicket TEST");
        System.out.println(blueTicket(3,5,5));
        System.out.println(blueTicket(22,5,12));
        System.out.println(blueTicket(12,2,10));

        // test commonDigit
        System.out.println();
        System.out.println("commonDigit TEST");
        System.out.println(commonDigit(24,14));
        System.out.println(commonDigit(23,13));
        System.out.println(commonDigit(54,45));



    }

}
