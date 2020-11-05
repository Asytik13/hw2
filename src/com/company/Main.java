package com.company;

public class Main {

    public static void main(String[] args){
        int shift = 5;

        String message = "uzgqnh%xyfynh%{tni%rfns-Xywnsl`b%fwlx.";
        // System.out.println(Main.encrypt(shift, message));
        System.out.println(Main.decrypt(shift, message));
    }

    public static String encrypt(int shift, String message){
        char[] result = new char[message.length()];
        for ( int i = 0 ; i < message.length() ; i++ ) {
            result[i] = (char) ( message.charAt(i) + shift );
        }
        return new String(result);
    }

    public static String decrypt(int shift, String message){
        char[] result = new char[message.length()];
        for ( int i = 0 ; i < message.length() ; i++ ) {
            result[i] = (char) ( message.charAt(i) - shift );
        }
        return new String(result);
    }
}