package gr.aueb.cf.ch5;

/* Βρίσκει αν το τρίγωνο είναι ορθογώνιο
    α^2 == b^2 + c^2

 */

import java.util.Scanner;

public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert tree double (a, b, c)");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = (Math.abs(a * a -b * b - c * c) <= EPSILON );

        System.out.println("Triangle is right: " + isRight);

    }
}
