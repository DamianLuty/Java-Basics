package rozdzial6.ZadaniaProgramistyczne.zadanie2;

public class Car {

    private int yearModel;
    private String make;
    private int speed;

    public Car (int yM, String m) {
        yearModel = yM;
        make = m;
        speed = 0;
    }

    public int setYearModel() {
        return yearModel;
    }

    public String setMake() {
        return make;
    }

    public int setSpeed() {
        return  speed;
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
    }
}

