package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y = 0;
        int d;
        int jumps = 0;

        System.out.println("Please provide X, Y and D values");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();

//        for (int i = x; i < y; i = i + d) {
//            jumps++;
//        }
        jumps = (int) Math.ceil((y- x) / (double) (d));

        System.out.println("Jumps: " + jumps);
    }
}
