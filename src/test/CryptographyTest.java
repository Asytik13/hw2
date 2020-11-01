package test;

import com.company.Main;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CryptographyTest {
    @Test
    public void encrypt_abc_fgh(){
        String expected = "fgh";
        String actual = Main.encrypt(5, "abc");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void decrypt_fgh_abc(){
        String expected = "abc";
        String actual = Main.decrypt(5, "fgh");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void encrypt_null_nullPointerException(){
        assertThatNullPointerException().isThrownBy(() -> {
            Main.encrypt(5, null);
        });
    }
}
