package Habr;

import static java.lang.Math.sqrt;

public class Three {
    public static void main(String[] args) {
        double d = sqrt(10.0);
        System.out.println(d);
    }
    public static double sqrt(double arg) {
        throw new RuntimeException();
    }
}
