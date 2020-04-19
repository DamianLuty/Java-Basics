package rozdzial6.ZadaniaProgramistyczne.zadanie10;

import java.util.Random;

public class Die {

    private int roll;
    private final int sides = 6;

    public Die() {
        roll = 0;
    }

    public void setRoll(int r) {
        roll = r;
    }

    public int getRoll() {
        return roll;
    }

    public int rollDie() {

        Random random = new Random();
        roll = random.nextInt(sides) + 1;
        return roll;
    }
}
