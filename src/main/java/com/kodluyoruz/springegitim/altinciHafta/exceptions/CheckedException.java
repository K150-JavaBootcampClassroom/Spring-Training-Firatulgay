package com.kodluyoruz.springegitim.altinciHafta.exceptions;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) {
            BufferedReader bufferedReader =null;

        try {
            File file = new File("src/main/resources/example.txt");
            FileReader fileReader = new FileReader(file.getAbsolutePath());
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }

    }
}
}
