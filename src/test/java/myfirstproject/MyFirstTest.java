package myfirstproject;

import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by gerardoalvarado on 24/05/2016.
 */
public class MyFirstTest {

    @Test
    public void should_return_the_same_string_when_uppercased() {
        assertThat("azerty".toUpperCase()).isEqualTo("AZERTY");
    }

    @Test
    public void should_verify_number (){
         int i=3;
        assertThat(i>7).isFalse();
    }

    @Test
    public void should_return_random_number(){
        Random r = new Random();
        int valeurMin= 0;
        int valeurMax= 20000;
        int valeur = valeurMin + r.nextInt(valeurMax - valeurMin);

    }

    @Test
    public void greet() {
       String yourName ="Stef";
        String name = "Gerardo";
        String.format("Hi", name," my name is",yourName);
    }

    }



