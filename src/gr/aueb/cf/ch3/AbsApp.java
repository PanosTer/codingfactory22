package gr.aueb.cf.ch3;

import java.util.Scanner;

public class AbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int abs= 0;

        System.out.println("Please provide two ints");
        num1 = in.nextInt();

        abs = (num1 > 0) ? num1 : -num1;

//        abs = (num1 > 0) ? num1 : (num1 < 0) ? -num1 : 0;

        System.out.println("Abs: " + abs);
    }
}
