package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true){
            try {
                System.out.println("Please insert a int");

                inputNum = in.nextInt();

                if (inputNum == MAGIC_NUM){
                    System.out.println("Great!");
                    break;
                }
            } catch (InputMismatchException e){
                in.nextLine();
                System.out.println("Error...");

            }

        }

        System.out.println("Thank you...");
    }

}
