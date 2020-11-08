package test;

import com.company.InputRange;
import com.company.InputValidator;
import com.company.Main;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class OrderTest {
    @Test
    public void encrypt_HappyPath(){
        String expected = "You selected tea, thank You";
        String actual = InputValidator.processUserInput("1");

        assertThat(actual).isEqualTo(expected);
    }

}
