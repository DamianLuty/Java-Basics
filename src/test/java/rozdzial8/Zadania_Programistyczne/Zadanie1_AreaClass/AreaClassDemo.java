package rozdzial8.Zadania_Programistyczne.Zadanie1_AreaClass;

/* This program is being used to test overloaded methods
    shared by AreaClass and calculate surface area for different figures
 */

public class AreaClassDemo {

    public static void main(String[] args) {

        //creating a new AreaClass object
        AreaClass item = new AreaClass();

        // calculating surface area for different figures:

        // circle
        AreaClass.getArea(3);

        // square
        AreaClass.getArea(3,3);

        // cylinder
        AreaClass.getArea(3.0,4.0);

    }
}
