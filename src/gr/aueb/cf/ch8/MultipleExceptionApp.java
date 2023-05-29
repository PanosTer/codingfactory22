package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionApp {

    public static void main(String[] args) {
        File file = new File("C:\\afile\\intfile.txt");
        char ch;

        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException | RuntimeException e1){
            System.out.println("File not found  error....");
        } catch (IOException e2){
            System.out.println("Read error....");
        } catch (Exception e3){
            System.out.println("Ooppssss something went wrong!");
        }
    }
}
