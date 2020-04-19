package rozdzial6.ZadaniaProgramistyczne.zadanie8;

import java.util.Scanner;

public class TemperatureDemo {

    public static void main(String[] args) {

    double celsius, kelvin, fahrenheitTemp;

    Scanner input = new Scanner(System.in);
    System.out.println("Podaj wartość w fahrenheitach: ");
    fahrenheitTemp = input.nextDouble();

    Temperature temp = new Temperature(fahrenheitTemp);

    celsius = temp.celciusTemp(fahrenheitTemp);
    kelvin = temp.kelvinTpmp(fahrenheitTemp);

        System.out.println("Temperatura w fahrenheitach: " + fahrenheitTemp);
        System.out.println("Temperatura w celciusach: " + celsius);
        System.out.println("Temperatura w kelvinach: " + kelvin);
    }
}
