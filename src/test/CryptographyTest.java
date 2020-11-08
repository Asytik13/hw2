package test;

import com.company.Main;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CryptographyTest {
    @Test
    public void encrypt_HappyPath(){
        String expected = "fgh";
        String actual = Main.convertString(5, "abc", false);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void decrypt_HappyPath(){
        String expected = "abc";
        String actual = Main.convertString(5, "fgh", true);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void convert_null_nullPointerException(){
        assertThatNullPointerException().isThrownBy(() -> {
            Main.convertString(5, null, true);
        });
    }
}
