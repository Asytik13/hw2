package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValidator {
    static InputRange range;
    static boolean inputIsValid = false;

    public static InputRange defineInput(String userInput){
        if ( userInput.equals("true") ) {
            InputValidator.inputIsValid = true;
            InputValidator.range = InputRange.STRINGTRUE;
        } else if ( userInput.equals("false") ) {
            InputValidator.inputIsValid = true;
            InputValidator.range = InputRange.STRINGFALSE;
        } else if ( userInput.equals("1") ) {
            InputValidator.inputIsValid = true;
            InputValidator.range = InputRange.SRTINGONE;
        } else if ( userInput.equals("0") ) {
            InputValidator.inputIsValid = true;
            InputValidator.range = InputRange.STRINGZERO;
        }
        return InputValidator.range;
    }

    public static void waitForValidInput(){
        String userInput;
        while (!InputValidator.inputIsValid) {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Your input is not valid, please provide correct value");
                userInput = reader.readLine();
                InputValidator.defineInput(userInput);
            } catch (NullPointerException | IOException e) {
            }
        }
    }

    public static String processUserInput(String input){
        InputValidator.defineInput(input);
        InputValidator.waitForValidInput();
        switch (InputValidator.range) {
            case STRINGTRUE:
                return "You selected coffee, thank You";
            case STRINGFALSE:
                return "I will bring You a glass of water";
            case SRTINGONE:
                return "You selected tea, thank You";
            case STRINGZERO:
                return "You didn't make your choice";
        }
        return null;
    }
}
