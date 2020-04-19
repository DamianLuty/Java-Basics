package rozdzial6.ZadaniaProgramistyczne.zadanie11;

import java.util.Scanner;

public class TemperaturesDemo {

    public static void main(String[] args) {

        double temperatureInput;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartość sprawdzanej temperatury: ");
        temperatureInput = input.nextDouble();

        Temperatures temperatures = new Temperatures(temperatureInput);

        if(temperatures.isWaterFreezing())
        System.out.println("Woda zamarza.");
        if(temperatures.isWaterBoiling())
        System.out.println("Woda wrze.");
        if(temperatures.isOxygenFreezing())
        System.out.println("Tlen zamarza.");
        if(temperatures.isOxygenBoiling())
        System.out.println("Tlen wrze.");
        if(temperatures.isEthyFreezing())
        System.out.println("Alkohol etylowy zamarza.");
        if(temperatures.isEthyBoiling())
        System.out.println("Alkohol etylowy wrze.");
    }
}
