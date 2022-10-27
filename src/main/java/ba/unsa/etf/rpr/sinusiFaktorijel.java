package ba.unsa.etf.rpr;
import java.lang.Math;


public class sinusiFaktorijel {
    public static double sinus(double n ) {
        return Math.sin(n);
    }
    public static int faktorijel(int n) {
        int faktorijel = 1;
        for (int i = 1; i<=n; i++)
            faktorijel *= i;
        return faktorijel;
    }
}
