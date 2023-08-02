import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @Test
    public void shouldSetNumberRadioIfNumberOfStationsNotDefault() {
        Radio radio = new Radio(25);

        Assertions.assertEquals(24, radio.getMaxNumber());
        Assertions.assertEquals(0, radio.getMinNumber());
    }

    @Test
    public void shouldNotSetNumberRadioIfNumberOfStationsZero() {
        Radio radio = new Radio(0);

        Assertions.assertEquals(0, radio.getMaxNumber());
        Assertions.assertEquals(0, radio.getMinNumber());

        radio.nextNumber();
        Assertions.assertEquals(0, radio.getCurrentNumber());

        radio.prevNumber();
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioNextNotDefault.csv")
    public void shouldSwitchToNextNumberRadioIfNumberOfStationsNotDefault(int currentNumber, int expected) {
        Radio radio = new Radio(60);
        radio.setCurrentNumber(currentNumber);
        radio.nextNumber();

        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioPrevNotDefault.csv")
    public void shouldSwitchToPrevNumberRadioIfNumberOfStationsNotDefault(int currentNumber, int expected) {
        Radio radio = new Radio(60);
        radio.setCurrentNumber(currentNumber);
        radio.prevNumber();

        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioSetNumber.csv")
    public void setNumberRadio(int currentNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentNumber(currentNumber);

        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioNext.csv")
    public void nextNumberRadio(int currentNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentNumber(currentNumber);

        radio.nextNumber();

        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioPrev.csv")
    public void prevNumberRadio(int currentNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentNumber(currentNumber);

        radio.prevNumber();

        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioSetVolume.csv")
    public void setVolumeRadio(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioVolumeDown.csv")
    public void volumeDownRadio(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.volumeDown();

        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioVolumeUp.csv")
    public void volumeUpRadio(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.volumeUp();

        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
