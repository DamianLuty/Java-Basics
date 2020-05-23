package rozdzial8.Zadania_Programistyczne.Zadanie3_Calculator;

public class RoomCarpet {

    private RoomDimensions size;
    private double carpetCost;

    public RoomCarpet(RoomDimensions dim, double cost) {
        carpetCost = cost;
        size = new RoomDimensions(dim);
    }

    public double getTotalCost() {
        return size.getArea()*carpetCost;
    }

    public String toString() {
        return "Łączna cena wykładziny wynosi: " + getTotalCost() + " zł.";
    }
}
