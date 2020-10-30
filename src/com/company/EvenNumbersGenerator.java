package com.company;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbersGenerator {
    public List<Integer> getEvenNumbersList(int min, int max) {
        List<Integer> evenNumbersList = new ArrayList<>();
        for (int i = min; i <= max; i++)
        {
            boolean isEven = i%2 == 0;
            if(isEven)
            {
                evenNumbersList.add(i);
            }
        }
        return evenNumbersList;
    }
}
