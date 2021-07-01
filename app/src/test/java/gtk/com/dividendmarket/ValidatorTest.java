package gtk.com.dividendmarket;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class ValidatorTest {

    @Test
    public void whenInputIsValid() {
        int amount = 100;
        String contents = "test contetns";
        Validator v = new Validator();
        boolean result = v.validateInput(amount, contents);

        assertThat(result).isEqualTo(true);
    }
    @Test
    public void whenInputIsInvalid() {
        int amount = 0;
        String contents = "";
        Validator v = new Validator();
        boolean result = v.validateInput(amount, contents);

        assertThat(result).isEqualTo(false);
    }
}