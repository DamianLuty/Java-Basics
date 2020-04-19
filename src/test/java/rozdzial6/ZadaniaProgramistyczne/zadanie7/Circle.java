package rozdzial6.ZadaniaProgramistyczne.zadanie7;

public class Circle {

    private double radius;
    private final double PI = 3.14159;
    private double area;
    private double diameter;
    private double circumfernece;

    public Circle (double rad) {
        radius = rad;
    }

    public  Circle() {
        radius = 0.0;
    }

    public void setRadius (double rad) {
        radius = rad;
    }

    public double getRadius () {
        return radius;
    }

    public double area(double radius) {
        return area = PI * radius * radius;
    }

    public double diameter(double radius) {
        return diameter = radius * 2;
    }

    public double circumference(double radius) {
        return circumfernece = 2 * PI * radius;
    }
}
