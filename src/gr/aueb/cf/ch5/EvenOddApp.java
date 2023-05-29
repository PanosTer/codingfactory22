package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("Pleased insert an int");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.printf("Num " + num +" is even: " + isNumEven);

    }

    public static boolean isEven(int n) {
        return n % 2 == 0;

//        if (n % 2 ==0) {
//            return true;
//        } else {
//            return false;
//        }
    }

}
