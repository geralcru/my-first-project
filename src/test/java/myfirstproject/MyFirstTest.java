package myfirstproject;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by gerardoalvarado on 24/05/2016.
 */
public class MyFirstTest {

    private static Logger log = Logger.getLogger(MyFirstTest.class);

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
        log.info(r);

    }

    @Test
    public void greet() {
       String yourName ="Stef";
        String name = "Gerardo";
        log.info(" Hi "+ name + ", My name is " + yourName);
        log.info(name + yourName);

    }
    }



