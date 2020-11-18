package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Collections.addAll;
import static java.util.stream.IntStream.range;

public class Main {

    public static void main(String[] args){


        Integer[] aaa = new Integer[]{1, 2, 5, 25};

        int res = Main.search(78, aaa);
        System.out.println(res);

        System.out.println(Main.reverse("Java"));
        System.out.println(Main.maximum(aaa));
        System.out.println(Main.average(Arrays.asList(aaa)));
        System.out.println(Main.getElement(Arrays.asList(aaa), 10));

        // Main.factorialBigNumbers(5);
        Main.calculateFactorial(25);

        Integer[] a = Main.fibonacci(10);
        for ( int i = 0 ; i < a.length ; i++ ) {
            System.out.println(a[i]);
        }

        List<Integer> list1 = new ArrayList<>();
        addAll(list1, a);

        Arrays.asList(list1).forEach(System.out::println);
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


    private static Integer[] fibonacci(int a){
        Integer[] result = new Integer[a];
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

    public static int search(Integer n, Integer[] list){
        int result;

        result = range(0, list.length)
                .filter(i -> n == list[i])
                .findFirst()
                .orElse(-1);

        return result;
    }

    public static String reverse(String s){
        char[] charArray = s.toCharArray();
        String reversedString = range(0, charArray.length)
                .map(i -> charArray[( charArray.length - 1 ) - i])
                .collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append).toString();
        return reversedString;
    }

    public static Integer maximum(Integer[] list){
        return Stream.of(list).mapToInt(v -> v).max().orElse(-1);
    }

    public static Double average(List<Integer> list){
        Double z = list.stream().mapToInt(x -> x).average().getAsDouble();
        return z;
    }

    public static List<String> upperCase(List<String> list){
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static Integer getElement(List<Integer> list, Integer n){

//      Integer res = IntStream.range(0, list.size())
//              .boxed()
//              .collect(Collectors.toMap(x->x, x->list.get(x)))
//              .entrySet()
//              .stream()
//              .filter(x->x.getKey() == n)
//              .findFirst()
//              .map(x->x.getValue())
//              .orElse(-1);


        Integer res = IntStream.range(0, list.size())
                .filter(i -> i == n)
                .mapToObj(list::get)
                .collect(Collectors.toList()).stream().findFirst().orElse(-1);
        return res;
    }
}