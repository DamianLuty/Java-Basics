package rozdzial8.Zadania_Programistyczne.Zadanie6_CashRegister;

import rozdzial6.ZadaniaProgramistyczne.zadanie4.RetailItem;

public class CashRegister {

    private int unit;
    private RetailItem retailItem;

    public CashRegister(int unit, RetailItem retail) {
        this.unit = unit;
        retailItem = new RetailItem(retail);
    }

    public double getSubTotal() {
        return retailItem.getPrice() * unit;
    }

    public double getTax() {
        return getSubTotal() * 0.23;
    }

    public double getTotal() {
        return getSubTotal()+ getTax();
    }

    public String toString() {
        return "Cena netto: " + getSubTotal() + "\nWartość podatku: " + getTax() + "\nŁączna cena: " + getTotal();
    }




}
