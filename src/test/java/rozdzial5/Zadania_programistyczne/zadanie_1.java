package rozdzial5.Zadania_programistyczne;

public class zadanie_1 {

    public static void main (String []args) {

        showChar("wp.pl", 2);

    }

    private static void showChar (String phrase, int characterAt) {

        char showCharacter;

        showCharacter = phrase.charAt(characterAt);
        System.out.println("Litera/znak z podanej pozycji " + "(" + characterAt + ")" + " to: ");
        System.out.println(showCharacter);
    }
}
