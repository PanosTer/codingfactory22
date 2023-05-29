package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        try (in){
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e){
//            e.printStackTrace();
            System.out.println("Error...");
        }

//        try (Scanner in = new Scanner(System.in)){
//            num = in.nextInt();
//            System.out.println(num);
//        } catch (InputMismatchException e){
//            e.printStackTrace();
//        }
    }
}
