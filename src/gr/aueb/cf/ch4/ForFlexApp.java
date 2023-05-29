package gr.aueb.cf.ch4;

import java.util.Scanner;

public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int starValue;
        int endValue = 0;
        int step;
        int iterations = 0;

        System.out.println("Please provide start, end and step values");
        starValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = starValue; i <= endValue; i = i + step) {
            iterations++;
            System.out.print(i + " ");
        }

        System.out.println("Iterations: " + iterations);
    }
}
