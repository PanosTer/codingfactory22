package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCoryApp {

    public static void main(String[] args) {
        byte[]  imageByte;
        Path sourcePath = Paths.get("C:/Afile/cf-logo.png");
        Path targetPath = Paths.get("C:/Afile/cf-logo-out.png");

        try {
            imageByte = Files.readAllBytes(sourcePath);
            Files.write(targetPath, imageByte);
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
