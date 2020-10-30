package test;

import com.company.EvenNumbersGenerator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class EvenNumbersGeneratorTests {
    @Test
    public void getEvenNumbersList_Range1to3_2()
    {
        EvenNumbersGenerator sut = new EvenNumbersGenerator();
        List<Integer> expectedResult = Arrays.asList(2);

        List<Integer> actualResult = sut.getEvenNumbersList(1, 3);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void getEvenNumbersList_Range0to0_0()
    {
        EvenNumbersGenerator sut = new EvenNumbersGenerator();
        List<Integer> expected = Arrays.asList(0);

        List<Integer> actual = sut.getEvenNumbersList(0, 0);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getEvenNumbersList_Range1to1_EmptyList()
    {
        EvenNumbersGenerator sut = new EvenNumbersGenerator();
        List<Integer> expected = Arrays.asList();

        List<Integer> actual = sut.getEvenNumbersList(1, 1);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getEvenNumbersList_Range2to4_2and4()
    {
        EvenNumbersGenerator sut = new EvenNumbersGenerator();
        List<Integer> expected = Arrays.asList(2, 4);

        List<Integer> actual = sut.getEvenNumbersList(1, 5);

        assertThat(actual).isEqualTo(expected);
    }
}
