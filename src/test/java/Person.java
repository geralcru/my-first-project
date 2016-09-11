import org.junit.Test;

/**
 * Created by gerardoalvarado on 29/07/2016.
 */
public class Person {
    String name = "Step";


    @Test
    public void should_give_name(){
        String yourName = "ALVARADO";
        String.format("Hi %s, my name is %s", name, yourName);
        System.out.println( name  + " "+ yourName);

    }
}
