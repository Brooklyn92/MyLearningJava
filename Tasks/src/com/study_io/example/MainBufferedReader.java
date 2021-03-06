package com.study_io.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class MainBufferedReader {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.err.println("Что-то пошло не так " + e.getMessage());
        }
    }
}
