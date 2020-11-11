package test;

import com.company.InputValidator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class OrderTest {
    @Test
    public void processUserInput_HappyPath(){
        String expected = "You selected tea, thank You";
        String actual = new InputValidator().processUserInput("1");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void processUserInput_InvalidInput(){
        assertThatNullPointerException().isThrownBy(() -> {
            new InputValidator().processUserInput("notValidInput");
        });
    }

    @Test
    public void processUserInput_NullInput(){
        assertThatNullPointerException().isThrownBy(() -> {
            new InputValidator().processUserInput(null);
        });
    }
}
