import org.junit.Test;

/**
 * Created by gerardoalvarado on 29/07/2016.
 */
public class Person {
    String name;

    public Person(String personName) {
        name = personName;
    }

    @Test
    public void should_give_name(){
        String yourName = "Gerardo";
        String.format("Hi %s, my name is %s", name, yourName);

    }
}
