import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioSetNumber.csv")
    public void setNumberRadio(int currentNumber, int expected){
        Radio radio = new Radio();
        radio.setCurrentNumber(currentNumber);

        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioNext.csv")
    public void nextNumberRadio(int currentNumber, int expected){
        Radio radio = new Radio();
        radio.setCurrentNumber(currentNumber);

        radio.nextNumber();

        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioPrev.csv")
    public void prevNumberRadio(int currentNumber, int expected){
        Radio radio = new Radio();
        radio.setCurrentNumber(currentNumber);

        radio.prevNumber();

        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioSetVolume.csv")
    public void setVolumeRadio(int currentVolume, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioVolumeDown.csv")
    public void volumeDownRadio(int currentVolume, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.volumeDown();

        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioVolumeUp.csv")
    public void volumeUpRadio(int currentVolume, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.volumeUp();

        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
