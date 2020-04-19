package rozdzial6.ZadaniaProgramistyczne.zadanie4;

public class RetailItemDemo {

    public static void main(String[] args) {

        RetailItem item1 = new RetailItem("Laptop Dell", 14, 3499.00);
        RetailItem item2 = new RetailItem("Playstation 4 PRO", 5, 1699.00);
        RetailItem item3 = new RetailItem("Siberia 800", 10, 699.99);

        System.out.println("Opis" + "\t\t\t\tLiczba sztuk" + "\t\tCena" );
        System.out.println("---------------------------------------------------");
        System.out.println(item1.getDescription() + "\t\t\t" + item1.getUnitsOnHand() + "\t\t\t\t\t" + item1.getPrice());
        System.out.println(item2.getDescription() + "\t" + item2.getUnitsOnHand() + "\t\t\t\t\t" + item2.getPrice());
        System.out.println(item3.getDescription() + "\t\t\t" + item3.getUnitsOnHand() + "\t\t\t\t\t" + item3.getPrice());
    }
}
