package rozdzial4.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_5 {

    public static void main (String []args) {

        String example;
        String character;
        int count = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ciag znakow: ");
        example = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Podaj znak, ktory ma zostac zliczony");
        character = input2.next();

            for (int x = 0; x < example.length(); x++)
                if (character.equals(String.valueOf(example.charAt(x))))
                {
                count++;
                }
        System.out.println(count);
    }
}
