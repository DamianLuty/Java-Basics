package rozdzial6.ZadaniaProgramistyczne.zadanie2;

public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car(12, "Audi");

        for (int x = 1; x < 6; x++) {
            car.accelerate();
            System.out.println("Aktualna prędkość wynosi: " + car.setSpeed());
        }

        System.out.println("-----------------------------");

        for (int x = 1; x < 6; x++) {
            car.brake();
            System.out.println("Aktualna prędkość wynosi: " + car.setSpeed());
        }

    }
}
