package rozdzial6.ZadaniaProgramistyczne.zadanie16;

public class RoulettePocket {

    private int number;

    public RoulettePocket(int num) {
        number = num;
    }

    public void setNumber(int num) {
        number = num;
    }

    public int getNumber() {
        return number;
    }

    public void getPocketColour(int num) {

            if (num == 0) {
                System.out.println("zielony");
            } else if (num >= 0 && num <= 10 && num % 2 == 0) {
                System.out.println("czarne");
            } else if (num >= 1 && num <= 10 && num % 2 == 1) {
                System.out.println("czerwone");
            } else if (num >= 11 && num <= 18 && num % 2 == 0) {
                System.out.println("czerwone");
            } else if (num >= 11 && num <= 18 && num % 2 == 1) {
                System.out.println("czarne");
            } else if (num >= 19 && num <= 28 && num % 2 == 0) {
                System.out.println("czarne");
            } else if (num >= 19 && num <= 28 && num % 2 == 1) {
                System.out.println("czerwone");
            } else if (num >= 29 && num <= 36 && num % 2 == 0) {
                System.out.println("czerwone");
            } else if (num >= 29 && num <= 36 && num % 2 == 1) {
                System.out.println("czarne");
            } else
                System.out.println("Błędna wartość! Podana liczba nie znajduje się w przedziale od 0 do 36");
    }
}
