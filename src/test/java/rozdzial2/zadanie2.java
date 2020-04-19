package rozdzial2;

public class zadanie2 {

    public static void main(String[] args) {

        String firstName, middleName, lastName;
        char firstInitial, middleInitial, lastInitial;

        firstName = "Damian";
        middleName = "Krzysztof";
        lastName = "Luty";

        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
        System.out.println(firstInitial);
        System.out.println(middleInitial);
        System.out.println(lastInitial);

    }
}
