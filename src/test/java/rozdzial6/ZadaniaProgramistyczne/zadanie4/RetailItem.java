package rozdzial6.ZadaniaProgramistyczne.zadanie4;

public class RetailItem {

    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem (String desc, int unit, double pr) {
        description = desc;
        unitsOnHand = unit;
        price = pr;
    }

    public void setDescription(String desc) {
        description = desc;
    }

    public void setUnitsOnHand(int unit) {
        unitsOnHand = unit;
    }

    public void setPrice(double pr) {
        price = pr;
    }

    public String getDescription() {
        return description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }
}
