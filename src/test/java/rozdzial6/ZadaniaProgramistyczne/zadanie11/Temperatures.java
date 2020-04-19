package rozdzial6.ZadaniaProgramistyczne.zadanie11;

public class Temperatures {

    private double temperature;

    public  Temperatures() {
        temperature = 0;
    }

    public Temperatures(double temp) {
        temperature = temp;
    }

    public void setTemperature(double temp) {
        temperature = temp;
    }

    public double getTemperature(double temp) {
        return temperature;
    }

    //zwraca prawdę
    public boolean isEthyFreezing() {
        return temperature <= -114.0;
    }

    public boolean isEthyBoiling() {
        return temperature >= 78.0;
    }

    public boolean isOxygenFreezing() {
        return temperature <= -218.0;
    }

    public boolean isOxygenBoiling() {
        return temperature >= -118.0;
    }

    public boolean isWaterFreezing() {
        return temperature <= 0.0;
    }

    public boolean isWaterBoiling() {
        return temperature >= 100.0;
    }


}
