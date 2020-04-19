package rozdzial7.Warsztat_Algorytmow;

public class warsztat_5   {

    public static void main(String[] args) {

        int[] id = new int[10];
        int[] salary = new int[10];

        for(int x = 0; x < id.length; x++) {
            id[x] = x + 1;
            salary[x] = 2000 + (x * 100);
            System.out.println("Pensja pracownika " + id[x] + " wynosi: " + salary[x]);
        }
    }
}
