package rozdzial7.Warsztat_Algorytmow;

import java.util.ArrayList;

public class warsztat_11 {

    public static void main (String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Maseratti");
        arrayList.add("Ferrari");
        arrayList.add("Bugatti");

        for(String cars : arrayList) {
            System.out.println(cars);
        }
    }
}
