package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        System.out.println("Would You like coffee? \r\n" +
                                   " If yes - please enter 'true'\r\n" +
                                   " If You prefer a tea - please enter '1'\r\n" +
                                   " If You prefer water instead of tea or coffee, please enter 'false'\r\n" +
                                   " If You don't want to continue - please enter '0'");

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String userInput = reader.readLine();
        System.out.println(InputValidator.processUserInput(userInput));

//        try {
//            BufferedReader reader =
//                    new BufferedReader(new InputStreamReader(System.in));
//            String userInput = reader.readLine();
//
//            String userOption = InputValidator.processUserInput(userInput);
//            System.out.println(userOption);
//
//        } catch (NullPointerException e) {
//            System.out.println("Your input is not valid, please provide correct value");
//            BufferedReader reader =
//                    new BufferedReader(new InputStreamReader(System.in));
//            String userInput = reader.readLine();
//
//            String userOption = InputValidator.processUserInput(userInput);
//            System.out.println(userOption);
//        }
    }
}