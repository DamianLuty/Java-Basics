package rozdzial8.Zadania_Programistyczne.Zadanie3_Calculator;

public class RoomDimensions {

    private double length;
    private double width;

    public RoomDimensions(double len, double w) {
        length = len;
        width = w;
    }

    public RoomDimensions(RoomDimensions dimensions) {
        length = dimensions.length;
        width = dimensions.width;
    }

    public double getArea() {

        return width*length;
    }

    public String toString() {

        return "Powieżchnia pokoju wynosi: " + getArea();
    }
}
