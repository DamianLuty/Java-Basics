package rozdzial6.WarsztatAlgorytmow.zadanie_3;

public class Square {

    private double sideLength;
    public double getArea()
    {
        return sideLength * sideLength;
    }

    public double getSideLength()
    {
        return sideLength;
    }

    public Square()
    {
        sideLength = 0.0;
    }

    public Square(double sl)
    {
        sideLength = sl;
    }
}
