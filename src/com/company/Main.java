package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args){
        EvenNumbersGenerator evenNumbersGenerator = new EvenNumbersGenerator();
        List<Integer> result = evenNumbersGenerator.getEvenNumbersList(0, 100);

        result.forEach(System.out::println);
    }
}
