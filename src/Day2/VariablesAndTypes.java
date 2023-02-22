package Day2;

import Utility.Util;

public class VariablesAndTypes {








    //main is the name of a function
    //void is the return type
    public static void main(String[] args) {
        System.out.println(Util.f2c(212));
        System.out.println(Util.investment(1.0,1,1,(int)1e9));

        int x = 7;
        System.out.println(x*x);
        x = 8;

        float e = 2.7182F; // don't use floats.
        double pi = 3.14159; // double precision

        // double electron_mass =
        // .0000000000000000000000000000000000091093837105;
        final double electron_mass = 9.109e-31;
        //electron_mass = 78;  *error

        //Avogadro's number = 6.0221408e+23
        final double number = 6.02214083+12;
    }
}

