package rozdzial6.CellPhone;

public class CellPhone {

    private String manufact;
    private String model;
    private double retailPrice;

    /** Konstruktor CellPhone
     @param man wartosc zapisywana w polu manufact
     @param mod wartosc zapisywana w polu model
     @param price wartosc zapisywana w polu retailPrice
     */

    public CellPhone(String man, String mod, double price) {
        manufact = man;
        model = mod;
        retailPrice = price;
    }

    public void setManufact(String man)
    {
        manufact = man;
    }
    public void setModel(String mod)
    {
        model = mod;
    }
    public void setRetailPrice(double price)
    {
        retailPrice = price;
    }

    public String getManufact()
    {
        return manufact;
    }
    public String getModel()
    {
        return model;
    }
    public double getRetailPrice()
    {
        return retailPrice;
    }
}
