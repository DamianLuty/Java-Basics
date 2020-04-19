package rozdzial7.Warsztat_Algorytmow;

public class warsztat_6_and_7 {

    public static void main(String[] args) {

        double avg;
        double sum = 0;
        int width;

        int[][] grades = new int[30] [10];
        width = grades.length - 1;

        System.out.println(grades.length + " " + grades[width].length);


        for(int x = 0; x < grades.length; x++) {
            for(int y = 0; y < grades[x].length; y++) {
                grades[x][y] = x + 1;

                sum += grades[x][y];
            }
        }
        avg = sum / (30*10);
        System.out.println(avg);
    }
}
