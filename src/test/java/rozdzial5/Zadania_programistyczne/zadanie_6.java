package rozdzial5.Zadania_programistyczne;

public class zadanie_6 {

    //Tabela z temperaturami w stopniach Celsjusza
    //wzór na przeliczanie z F na C: C = 5/9 * (F - 32)

    public static void main(String[] args) {

        double score;
        System.out.println("Fahrenheit \t \t \t Celsius");
        System.out.println("---------------------------------------");

        for(int x = 0; x <= 20; x++) {
            score = celsius(x);
            System.out.println("\t" + x + "\t \t \t" + score);
        }
    }

    private static double celsius (double f) {
        double c;
        return c = 5.0/9.0 * (f - 32);
    }
}
