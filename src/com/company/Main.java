package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    private static void help() {
        System.out.println("file    -   reads from the file");
        System.out.println("console -   reads from the console");
        System.out.println("exit    -   exits the program ");
    }

    public static void main(String[] args) {
        double [] results;
        Scanner scanner;
        String option = "";
        while (!option.equals("exit")) {
            scanner = new Scanner(System.in);
            System.out.println("Type help for command list");
            System.out.println("Enter command: ");
            try {
                option = scanner.next();
                switch (option) {
                    case "file":
                        ReadFile test = new ReadFile();
                        String data = test.getData();
                        Pattern pattern = Pattern.compile(" |,");
                        results = pattern.splitAsStream(data)
                                .mapToDouble(Double::parseDouble)
                                .toArray();

                    case "console":
                        Scanner a = new Scanner(System.in);
                        Scanner b=new Scanner(System.in);
                        System.out.println("First number: ");
                        double first=a.nextDouble();
                        System.out.println("Second number: ");
                        double second=b.nextDouble();
                        System.out.println("Your numbers are: "+first+" "+second);


                }
            } catch (Exception ex) {
                System.out.println("Please enter a valid command");
                scanner.next();
            }

        }
    }
}
