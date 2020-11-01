package com.company;

public class Main {

    public static void main(String[] args){
        System.out.println(Main.factorial(5));
    }

    private static int factorial(int num){
        return num * Main.factorial(num - 1);
    }
}
