package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0) && isRaining;

        System.out.println("Is snowing: " + isSnowing);
    }
}
