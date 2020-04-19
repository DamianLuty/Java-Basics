package rozdzial4.PunktKontrolny;

public class petleZagniezdzone {

    public static void main (String []args){

        int cols = 6;
        int rows = 6;
        String a = "*";
        StringBuilder b = new StringBuilder();

        for (int col = 0; col < cols; col++){
            b.append(a);
            System.out.println(b);
        }

    }
}
