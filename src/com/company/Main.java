package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){
        int num = 5;
        System.out.println(Main.factorial(num));
        System.out.println(Main.factorialStream(num));
    }

    private static int factorial(int num){
        if ( num <= 2 ) {
            return num;
        }
        return num * Main.factorial(num - 1);
    }

    private static int factorialStream(int num){
        int result = IntStream.rangeClosed(1, num).reduce(1, ( (x, y) -> x * y ));
        return result;
    }
}