package com.company;

import java.sql.SQLOutput;

public class InputValidator {

    InputRange range;

    public InputRange defineInput(String userInput){

        if ( userInput.equals("true") ) {
            range = InputRange.STRINGTRUE;
        } else if ( userInput.equals("false") ) {
            range = InputRange.STRINGFALSE;
        } else if ( userInput.equals("1") ) {
            range = InputRange.SRTINGONE;
        } else if ( userInput.equals("0") ) {
            range = InputRange.STRINGZERO;
        }

        return range;
    }

    public void processUserInput(){
        switch (range) {
            case STRINGTRUE:
            case STRINGFALSE:
                System.out.println("Boolean type was provided");
                break;
            case SRTINGONE:
            case STRINGZERO:
                System.out.println("Integer type was provided");
                break;
            default:
                System.out.println("Provided value  incorrect. Please input 'true', 'false, '1' or '0''");
                break;
        }
    }

}
