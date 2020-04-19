package rozdzial2;

import java.util.Scanner;

public class zadanie18 {

    public static void main(String []args) {

        String name;
        String age;
        String placeOfLiving;
        String collageName;
        String profession;
        String animalSpecies;
        String animalName;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        name = keyboard.nextLine();

        System.out.println("Ile masz lat?");
        age = keyboard.nextLine();

        System.out.println("Podaj nazwe miejscowosci w ktorej mieszkasz: ");
        placeOfLiving = keyboard.nextLine();

        System.out.println("Podaj nazwe swojej uczelni (aktualnej, badz tej, do ktorej uczeszczales/as");
        collageName = keyboard.nextLine();

        System.out.println("Jaki masz zawod (moze byc wyuczony)?");
        profession = keyboard.nextLine();

        System.out.println("Podaj gatunek zwierzecia: ");
        animalSpecies = keyboard.nextLine();

        System.out.println("Podaj imie dla wczesniej podanego zwierzecia:");
        animalName = keyboard.nextLine();

        System.out.println("Pewnego razu zyl/a sobie " + name + " , ktory mieszkal w " + placeOfLiving +
                            " ." +
                            "\n W wieku " + age + " lat " +  name + " rozpoczal/ela studia na: " + collageName + "." +
                            "\n " + name + " ukonczyl/a studia i rozpoczal/ela prace jako " + profession + "." +
                            "\n Wtedy " + name + " adoptowal/a " + animalSpecies +  " o imieniu " + animalName +
                            " i zyli razem dlugo i szczesliwie.");
    }
}
