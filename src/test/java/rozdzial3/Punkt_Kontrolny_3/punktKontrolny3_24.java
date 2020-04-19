package rozdzial3.Punkt_Kontrolny_3;

import java.util.Scanner;

public class punktKontrolny3_24 {

    public static void main(String []args){

        int userNum;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wpisz jedna z liczb" +
                            "1, 2 lub 3: ");
        userNum = keyboard.nextInt();

        switch (userNum)
        {
            case 1 :
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
        }

    }
}
