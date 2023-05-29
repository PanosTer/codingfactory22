package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LinearBingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final  int SECRET = 17;
        boolean bingo = false;

//        while (!bingo){
//            System.out.println("Please provide a num");
//            num = in.nextInt();
//
//            if (num != SECRET){
//                System.out.println("Try again!");
//                continue;
//            }
//            System.out.println("Bingo!!!");
//            bingo = true;
//        }

        do {
            System.out.println("Please provide a num");
            num = in.nextInt();

            if (num != SECRET){
                System.out.println("Try again!");
                continue;
            }
            System.out.println("Bingo!!!");
            bingo = true;
        } while (!bingo);
    }
}
