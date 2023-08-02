import lombok.Getter;

public class Radio {
    @Getter
    private int maxNumber;
    @Getter
    private int minNumber = 0;
    @Getter
    private int currentNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    @Getter
    private int currentVolume;

    public Radio() {
        this.maxNumber = 9;
    }

    public Radio(int maxNumber) {
        if (maxNumber <= 0) {
            return;
        }
        this.maxNumber = maxNumber - 1;
    }



    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < minNumber) {
            return;
        }
        if (currentNumber > maxNumber) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public void nextNumber() {
        if (currentNumber == maxNumber) {
            currentNumber = minNumber;
        } else {
            currentNumber = currentNumber + 1;
        }
    }

    public void prevNumber() {
        if (currentNumber == minNumber) {
            currentNumber = maxNumber;
        } else {
            currentNumber = currentNumber - 1;
        }
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
}
