package com.example.DreamsMlk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DreamCount {
    public static void main(String[] args) {

        SpringApplication.run(DreamCount.class, args);
        try {
            File speechFile = new File("C:/Users/hisna/IdeaProjects/DreamsMlk/src/main/java/com/example/DreamsMlk/MLK.txt");
            Scanner fileReader = new Scanner(speechFile);
            ArrayList<String> words = new ArrayList<>();
            while (fileReader.hasNext()) {
                String word = fileReader.next();
                words.add(word);

            }
            fileReader.close();
            for (String word : words) {

                System.out.println(word);

            }


        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
