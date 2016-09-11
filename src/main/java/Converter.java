/**
 * Created by gerardoalvarado on 11/09/2016.
 */
public interface Converter<T> {

    /**
     * Converts the given object of <code>T</code> to a String
     *
     * @param type the object of type <code>T</code> to convert
     * @return type as string
     */
    String asString(T type);

    /**
     * Converts the given string to <code>T</code>
     *
     * @param s the String to convert
     * @return the converted element of type <code>T</code>
     * @throws NumberFormatException if the given string could not be passe to <code>T</code>
     */
    T fromString(String s);
}
