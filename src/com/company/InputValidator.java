package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValidator {


    static boolean inputIsValid = false;

    public InputRange defineInput(String userInput){
        InputRange range = null;
        if ( userInput.equals("true") ) {
            InputValidator.inputIsValid = true;
            range = InputRange.STRINGTRUE;
        } else if ( userInput.equals("false") ) {
            InputValidator.inputIsValid = true;
            range = InputRange.STRINGFALSE;
        } else if ( userInput.equals("1") ) {
            InputValidator.inputIsValid = true;
            range = InputRange.SRTINGONE;
        } else if ( userInput.equals("0") ) {
            InputValidator.inputIsValid = true;
            range = InputRange.STRINGZERO;
        }
        return range;
    }

    public void waitForValidInput(){
        String userInput;
        while (!InputValidator.inputIsValid) {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Your input is not valid, please provide correct value");
                userInput = reader.readLine();
                InputRange range = defineInput(userInput);
            } catch (NullPointerException | IOException e) {
            }
        }
    }

    public String processUserInput(String input){
        InputRange range = defineInput(input);
        waitForValidInput();
        switch (range) {
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
