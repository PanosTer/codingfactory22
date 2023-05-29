package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isDark = false;
        boolean isRaining = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isRunning || isDark) ;

        System.out.println("Lights On: " + lightsOn);

    }
}
