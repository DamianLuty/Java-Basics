package rozdzial6.ZadaniaProgramistyczne.zadanie8;

public class Temperature {

    private double fahrenheit;
    private double celsius;
    private double kelvin;

    public Temperature (double ftemp) {
        fahrenheit = ftemp;
    }

    public void setFahrenheit(double ftemp) {
        fahrenheit = ftemp;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double celciusTemp(double ftemp) {
        return celsius = (5.0/9.0) * (ftemp - 32);
    }

    public double kelvinTpmp(double ftemp) {
        return kelvin = ((5.0/9.0) * (ftemp - 32)) + 273;
    }


}
