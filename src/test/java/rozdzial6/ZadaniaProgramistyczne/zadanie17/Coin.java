package rozdzial6.ZadaniaProgramistyczne.zadanie17;

import java.util.Random;

public class Coin {

    private String sideUp;

    public Coin() {
        Random random = new Random();
        int toss = random.nextInt(2) + 1;

        if(toss == 1) {
            sideUp = "orzeł";
        } else
            sideUp = "reszka";
    }

    public Coin (String side) {
        sideUp = side;
    }

    public void setSideUp(String side) {
        sideUp = side;
    }

    public String getSideUp() {
        return sideUp;
    }

    public void toss() {

        Random random = new Random();
        int toss = random.nextInt(2) + 1;

        if(toss == 1) {
            sideUp = "orzeł";
        } else
            sideUp = "reszka";
    }
}
