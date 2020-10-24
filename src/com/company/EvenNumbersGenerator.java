package com.company;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbersGenerator {
    public List<Integer> getEvenNumbersList(int min, int max) {
        List<Integer> evenNumbersList = new ArrayList<>();
        for (int i = min; i <= max; i++)
        {
            if(i%2 == 0)
            {
                evenNumbersList.add(i);
            }
        }
        return evenNumbersList;
    }
}
