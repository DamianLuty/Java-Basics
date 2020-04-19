package rozdzial6.Rectangle;

public class Rectangle {

    private double length;
    private double width;

    /**
     Metoda setLength zapisuje wartosc w polu length.
     @param len Wartosc zapisywana w polu length.
     */

    public Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }

    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

    public void setLength (double len)
    {
        length = len;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getArea()
    {
        return  length * width;
    }
}