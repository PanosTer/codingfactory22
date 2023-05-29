package gr.aueb.cf.ch5;

import javax.lang.model.util.ElementScanner6;
import javax.swing.text.DefaultStyledDocument;
import java.util.Scanner;

public class DoubleCompareApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d1;
        double d2;
        final double EPSILON = 0.5;

        System.out.println("Please insert two doubles");
        d1 = in.nextDouble();
        d2 = in.nextDouble();

        if (Math.abs(d2 - d1) < EPSILON){
            System.out.println("EQUAL");
        }else {
            System.out.println("NOT EQUAL");
        }


    }
}
