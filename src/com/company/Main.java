package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EvenNumbersGenerator evenNumbersGenerator = new EvenNumbersGenerator();
        List<Integer> result = evenNumbersGenerator.getEvenNumbersList(0, 100);
        for ( int temp : result ) {
            System.out.println(temp);
        }
    }
}
