package test;

import com.company.EvenNumbersGenerator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class EvenNumbersGeneratorTests {
    @Test
    public void Min_One_Max_Tree_Results_In_Two()
    {
        EvenNumbersGenerator sut = new EvenNumbersGenerator();
        List<Integer> expectedResult = Arrays.asList(2);

        List<Integer> actualResult = sut.getEvenNumbersList(1, 3);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void Min_And_Max_Are_Zero_And_Equal_Results_In_Zero()
    {
        EvenNumbersGenerator sut = new EvenNumbersGenerator();
        List<Integer> expectedResult = Arrays.asList(0);

        List<Integer> actualResult = sut.getEvenNumbersList(0, 0);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void Min_And_Max_Are_NotEven_And_Equal_Results_In_Null()
    {
        EvenNumbersGenerator sut = new EvenNumbersGenerator();
        List<Integer> expectedResult = Arrays.asList();

        List<Integer> actualResult = sut.getEvenNumbersList(1, 1);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void Min_One_Max_Five_Results_In_Two_And_Four()
    {
        EvenNumbersGenerator sut = new EvenNumbersGenerator();
        List<Integer> expectedResult = Arrays.asList(2, 4);

        List<Integer> actualResult = sut.getEvenNumbersList(1, 5);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
