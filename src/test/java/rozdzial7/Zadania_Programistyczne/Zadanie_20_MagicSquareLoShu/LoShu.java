package rozdzial7.Zadania_Programistyczne.Zadanie_20_MagicSquareLoShu;

import java.util.Scanner;

public class LoShu {

    public static void main(String[] args) {

        int[][] square = new int[3][3];
        int field;

        Scanner input = new Scanner(System.in);
        System.out.println("Wypelnij kwadrat 9 wartosciami. ");
        for(int x = 0; x < square.length; x++) {
            for(int y = 0; y < square[x].length; y++) {
                System.out.println("Podaj wartość pola [" + x + "]" + "[" + y + "]");
                field = input.nextInt();
                square[x][y] = field;
            }
        }
        LoShuCheck(square);

    }
    private static void LoShuCheck(int[][] square) {

        int cell;
        int row1 = 0, row2 = 0, row3 = 0;
        int column1 = 0, column2 = 0, column3 = 0;
        int diagonal1 = 0, diagonal2 = 0;
        String yes = "Podany kwadrat jest kwadratem LoShu";
        String no = "Podany kwadrat nie jest kwadratem LoShu";

        for(int x = 0; x < square.length; x++) {
            for(int y = 0; y < square[x].length; y++) {
                cell = square[x][y];
                if(x == 0) {
                    row1 += cell;
                } else if(x == 1) {
                    row2 += cell;
                } else {
                    row3 += cell;
                }
            }
        }

        for(int x = 0; x < square.length; x++) {
            for(int y = 0; y < square[x].length; y++) {
                cell = square[y][x];
                if(x == 0) {
                    column1 += cell;
                } else if(x == 1) {
                    column2 += cell;
                } else {
                    column3 += cell;
                }
            }
        }

        for(int x = 0; x < square.length; x++) {
            cell = square[x][x];
            diagonal1 += cell;
        }

        for(int x = 0; x < square.length; x++) {
            for(int y = 0; y < square[x].length; y++) {
                cell = square[x][y];
                if(x == 2 && y == 0) {
                    diagonal2 += cell;
                }
                if(x == 1 && y == 1) {
                    diagonal2 += cell;
                }
                if(x == 2 && y == 0) {
                    diagonal2 += cell;
                }
            }
        }
        int avg = (row1 + row2 + row3 + column1 + column2 + column3 + diagonal1 + diagonal2)/8;

        for(int x = 0; x < square.length; x++) {
            for (int y = 0; y < square[x].length; y++) {
                System.out.print(square[x][y] + " ");
            }
            System.out.println();
        }
        if(avg == row1) {
            System.out.println(yes);
        } else
            System.out.println(no);
    }

}
