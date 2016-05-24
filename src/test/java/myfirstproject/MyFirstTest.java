package myfirstproject;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by gerardoalvarado on 24/05/2016.
 */
public class MyFirstTest {

    @Test
    public void should_return_the_same_string_when_uppercased() {
        assertThat("azerty".toUpperCase()).isEqualTo("AZERTY");
    }
}
