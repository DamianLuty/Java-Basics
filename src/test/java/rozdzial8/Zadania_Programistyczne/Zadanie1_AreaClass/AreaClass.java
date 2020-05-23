package rozdzial8.Zadania_Programistyczne.Zadanie1_AreaClass;

/* this class calculates area for three different figures by using overloaded methods:
    - circle
    - square
    - cylinder
 */

public class AreaClass {

    private static double radius;
    private static double height;
    private static int a;
    private static int b;

    // this method calculates circle surface area
    public static void getArea(double radius) {
        double pi = Math.PI;
        double area =  pi * (radius*radius);

        System.out.println("Pole koła wynosi: " + area);
    }

    // this method calculates square surface area
    public static void getArea(int a, int b) {
        int area = a * b;

        System.out.println("Pole prostokąta wynosi: " + area);
    }

    //this method calculates cylinder surface area
    public static void getArea(double radius, double height) {
        double pi = Math.PI;
        double area = pi * (radius*radius) * height;

        System.out.println("Pole Walca wynosi: " + area);
    }
}
