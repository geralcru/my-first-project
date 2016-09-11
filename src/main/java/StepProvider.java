/**
 * Created by gerardoalvarado on 11/09/2016.
 */
public interface StepProvider {

    /**
     * Adds a {@link SettingsProvider} to the Settings object.
     *
     * A Settings object can contain more than just one SettingsProvider to allow chaining.
     */
    StepMoreProvider provider(SettingsProvider settingsProvider);
}
