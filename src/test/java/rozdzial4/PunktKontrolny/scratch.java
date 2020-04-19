package rozdzial4.PunktKontrolny;

import java.util.Scanner;

public class scratch {

    public static void main(String[] args) {

        int kmSpeed;
        double forMPH = 0.6214;

        System.out.println("KM/H    MPH");
        System.out.println("-----------");

        for (kmSpeed = 60; kmSpeed <= 130; kmSpeed += 10)
            System.out.printf("%d\t\t%.1f\n", kmSpeed, kmSpeed * forMPH);






    }
}
