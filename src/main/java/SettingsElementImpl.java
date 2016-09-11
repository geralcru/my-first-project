/**
 * Created by gerardoalvarado on 11/09/2016.
 */
 class SettingsElementImpl<T> extends SettingsElement<T> {

    private T defaultValue;
    private Converter<T> converter;

    public SettingsElementImpl(String key, T defaultValue, Converter<T> converter)
    {
        super(key);
        this.defaultValue = defaultValue;
        this.converter = converter;
    }

    @Override
    public T getDefaultValue()
    {
        return defaultValue;
    }

    @Override
    public T parseValue(String value)
    {
        return converter.fromString(value);
    }

    @Override
    public String asString(T value)
    {
        return converter.asString(value);
    }

}
