package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }
    private static void help_operation(){
        System.out.println("addition\nsubstraction\nmultiplication\ndivision\nlogarithm\npower");
    }
    private static void solution(double first, double second){
        System.out.println("Your numbers are: "+first+" "+second+"\n");
        System.out.println("Select an operation: ");
        Scanner a=new Scanner(System.in);
        String operation;
        operation=a.next();
        switch(operation){
            case "addition":
                Addition addition=new Addition();
                System.out.println("Result:"+addition.calculate(first,second));
                break;
            case "substraction":
                Substraction substraction=new Substraction();
                System.out.println("Result:"+substraction.calculate(first,second));
                break;
            case "multiplication":
                Multiplication multiplication=new Multiplication();
                System.out.println("Result:"+multiplication.calculate(first,second));
                break;
            case "division":
                Division division=new Division();
                System.out.println("Result:"+division.calculate(first,second));
                break;
            case "power":
                Power power=new Power();
                System.out.println("Result:"+power.calculate(first,second));
                break;
            case "logarithm":
                Logarithm logarithm=new Logarithm();
                System.out.println("Result:"+logarithm.calculate(first,second));
                break;
        }
    }

    private static void help() {
        System.out.println("file    -   reads from the file");
        System.out.println("console -   reads from the console");
        System.out.println("exit    -   exits the program ");
    }

    public static void main(String[] args) {
        Scanner scanner;
        String option = "";
        while (!option.equals("exit")) {
            scanner = new Scanner(System.in);
            System.out.println("Type help for command list");
            System.out.println("Type \"help_operation\" to see operation list.");
            System.out.println("Enter command: ");
            try {
                option = scanner.next();
                switch (option) {
                    case "help_operation":
                        help_operation();
                        break;
                    case "help":
                        help();
                        break;
                    case "file":
                        double[] results;
                        ReadFile test = new ReadFile();
                        String data = test.getData();
                        Pattern pattern = Pattern.compile(" |,");
                        results = pattern.splitAsStream(data)
                                .mapToDouble(Double::parseDouble)
                                .toArray();
                        solution(results[0],results[1]);
                        break;

                    case "console":
                        Scanner a = new Scanner(System.in);
                        System.out.println("First number: ");
                        double first=a.nextDouble();
                        System.out.println("Second number: ");
                        a= new Scanner(System.in);
                        double second=a.nextDouble();
                        solution(first, second);
                        break;

                }
            } catch (Exception ex) {
                System.out.println("Please enter a valid command");
                scanner.next();
            }

        }
    }
}
