package rozdzial6.ZadaniaProgramistyczne.zadanie14;

public class ResearchDemo {

    public static void main(String[] args) {

        double fullTestCost;

        Patient patient = new Patient("Damian Luty", "Janiny Porazińskiej 16/28, 81-593 Gdynia",
                            791800324, "Katarzyna Dmitrus-Krakowiak", 123123123);

        Procedure test1 = new Procedure("badanie fizykalne", "30.03.2020", "dr Iwicki",
                250.00);
        Procedure test2 = new Procedure("zdjęcia rentgenowskie", "30.03.2020", "dr Jaracz",
                500.00);
        Procedure test3 = new Procedure("badanie krwi", "30.03.2020", "dr Szymczak",
                200.00);

        fullTestCost = test1.getTestCharge() + test2.getTestCharge() + test3.getTestCharge();

        System.out.println("INFORMACJE O PACJENCIE");
        System.out.println("**********************");
        System.out.println("imię: " + patient.getFullName());
        System.out.println("adres: " + patient.getFullAddress());
        System.out.println("nr telefonu: " + patient.getPhoneNumber());
        System.out.println("osoba kontaktowa: " + patient.getContactPersonName());
        System.out.println("numer telefonu osoby kontaktowej: " + patient.getContactPersonPhoneNumber());
        System.out.println("**********************");
        System.out.println("BADANIA");
        System.out.println("************************");
        System.out.println("badanie: " + test1.getTestName());
        System.out.println("data: " + test1.getTestDate());
        System.out.println("osoba przeprowadzająca badanie: " + test1.getTestingPersonName());
        System.out.println("cena badania: " + test1.getTestCharge());
        System.out.println();
        System.out.println("************************");
        System.out.println("badanie: " + test2.getTestName());
        System.out.println("data: " + test2.getTestDate());
        System.out.println("osoba przeprowadzająca badanie: " + test2.getTestingPersonName());
        System.out.println("cena badania: " + test2.getTestCharge());
        System.out.println();
        System.out.println("************************");
        System.out.println("badanie: " + test3.getTestName());
        System.out.println("data: " + test3.getTestDate());
        System.out.println("osoba przeprowadzająca badanie: " + test3.getTestingPersonName());
        System.out.println("cena badania: " + test3.getTestCharge());
        System.out.println();
        System.out.println("ŁĄCZNY KOSZT BADAŃ: " + fullTestCost);
    }
}
