package rozdzial6.CellPhone;

import java.util.Scanner;

public class CellPhoneTest {

    public static void main(String[] args) {

        String testManufact;
        String testModel;
        double testPrice;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj producenta telefonu: ");
        testManufact = input.nextLine();

        System.out.println("Podaj model telefonu: ");
        testModel = input.nextLine();

        System.out.println("Podaj cene telefonu: ");
        testPrice = input.nextDouble();

        CellPhone phone = new CellPhone(testManufact, testModel, testPrice);

        System.out.println("Podany przez uzytkownika telefon to: ");
        System.out.println("Firma: " + phone.getManufact());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Cena: " + phone.getRetailPrice());
    }
}
