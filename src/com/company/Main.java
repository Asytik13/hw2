package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){
        // Main.factorialBigNumbers(5);
        // Main.calculateFactorial(25);
        int[] a = Main.fibonacci(10);
        for ( int i = 0 ; i < a.length ; i++ ) {
            System.out.println(a[i]);
        }

        Arrays.asList(a).forEach(System.out::println);
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


    public static void calculateFactorial(int number){
        BigInteger one = BigInteger.ONE;

        for ( int i = 1 ; i <= number ; i++ ) {
            BigInteger integer = BigInteger.valueOf(i);
            one = one.multiply(integer);
        }
        System.out.println(one);
    }


    private static int[] fibonacci(int a){


        int[] result = new int[a];
        int number1 = 0;
        int number2 = 1;
        int sum;

        for ( int i = 1 ; i < a ; ++i ) {
            sum = number1 + number2;
            result[i] = sum;
            number1 = number2;
            number2 = sum;
        }
        return result;
    }
}