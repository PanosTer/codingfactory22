package gr.aueb.cf.ch10;

import java.util.Scanner;

public class ProjectCh5 {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        boolean quit = false;
        String response = "";

        do {
            printMenu();
            response = getChoice();

            try {
                if (response.matches("[Qq]")) {
                    quit = true;
                }else {
                    printOnChoice(response);
                }
            } catch (IllegalArgumentException e){
                System.out.println("Invalid Choice");
            }
        } while (!quit);
    }

    public static void printMenu(){
        System.out.println("Please select one of the following: ");
        System.out.println("1. Horizontal Stars");
        System.out.println("2. Vertical Stars");
        System.out.println("3. HV Stars");
        System.out.println("4. HV Asc Stars");
        System.out.println("5. HV Desc Stars");
        System.out.println("Q or q to Quit");
    }

    public static String getChoice(){
        return in.nextLine().trim();
    }

    public static void printOnChoice(String s) throws  IllegalArgumentException {
        int choice = -1;
        int n = 0;

        try {
            if (s == null) throw new IllegalArgumentException();
            choice = Integer.parseInt(s);
            if (choice >= 1 && choice <= 5){
                System.out.println("Please insert the number of stars");
                n = Integer.parseInt(getChoice());
            }

            switch (choice){
                case 1:
                    printStarsHor(n);
                    break;
                case 2:
                    printStarsVer(n);
                    break;
                case 3:
                    printStarsHorVer(n);
                    break;
                case 4:
                    printStarsHorVerAsc(n);
                    break;
                case 5:
                    printStarsHorVerDesc(n);
                    break;
                default:
                    throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e){
//            e.printStackTrace();
            throw e;
        }
    }

    public static void printStarsHor(int n){
        for (int i = 1; i <= n; i++){
            System.out.print("*");
        }
    }

    public static void printStarsVer(int n){
        for (int i = 1; i <= n; i++){
            System.out.println("*");
        }
    }

    public static void printStarsHorVer(int n){
        for (int i = 1; i <= n; i++){
            printStarsHor(n);
            System.out.println();
        }
    }

    public static void printStarsHorVerAsc(int n){
        for (int i = 1; i <= n; i++){
            printStarsHor(i);
            System.out.println();
        }
    }

    public static void printStarsHorVerDesc(int n){
        for (int i = n; i >= 1; i--){
            printStarsHor(i);
            System.out.println();
        }
    }


}
