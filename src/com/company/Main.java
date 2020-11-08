package com.company;

public class Main {

    public static void main(String[] args){
        int shift = 5;

        String message = "uzgqnh%xyfynh%{tni%rfns-Xywnsl`b%fwlx.";
        System.out.println(Main.convertString(shift, message, false));
        System.out.println(Main.convertString(shift, message, true));
    }


    public static String convertString(int shift, String message, boolean isEncrypted){
        char[] result = new char[message.length()];

        for ( int i = 0 ; i < message.length() ; i++ ) {
            if ( isEncrypted ) {
                result[i] = (char) ( message.charAt(i) - shift );
            } else {
                result[i] = (char) ( message.charAt(i) + shift );
            }
        }
        return new String(result);
    }
}