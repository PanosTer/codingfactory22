package gr.aueb.cf.ch3;

import java.util.Scanner;

public class StarsStepApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;

        System.out.println("Please insert star, end value and step");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();
        int i = 0;

        i = start;
        while (i <= end){
            System.out.print("*");
            i = i + step;
        }
    }
}
