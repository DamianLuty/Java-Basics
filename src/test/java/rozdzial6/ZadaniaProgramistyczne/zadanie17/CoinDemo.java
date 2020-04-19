package rozdzial6.ZadaniaProgramistyczne.zadanie17;

public class CoinDemo {

    public static void main(String[] args) {

        int head = 0, tails = 0;
        int sumHeads = 0;
        int sumTails = 0;

        Coin coin = new Coin();
        System.out.println("Wartość początkowa: " + coin.getSideUp());

        for (int x = 1; x <= 20; x++) {
            coin.toss();

            if(coin.getSideUp().equalsIgnoreCase("orzeł")) {
                head = 1;
                tails = 0;
            } else {
                tails = 1;
                head = 0;
            }
            sumHeads += head;
            sumTails += tails;

            System.out.println("Rzut " + x + ": " + coin.getSideUp());
        }
        System.out.println("Ilość reszek: " + sumTails);
        System.out.println("Ilość orłów: " + sumHeads);
    }
}
