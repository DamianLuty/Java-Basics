package rozdzial6.Rectangle;

public class RectangleDemo {

    public static void main(String[] args)
    {
        Rectangle box = new Rectangle();

        box.setLength(10.0);
        box.setWidth(20.0);

        System.out.println("dlugość prostokąta wynosi " +  box.getLength() + " .");
        System.out.println("Szerokość prostokąta wynosi " + box.getWidth() + " .");
        System.out.println("Powierzchnia prostokąta wynosi " + box.getArea() + " .");
    }
}

//      6.18 - na podstawie nazwy klasy
//      6.19 - typ prosty zadelkarownay w konstruktorze
//      6.20 - a - ClassAct
//           - b - ClassAct test = new ClassAct(25);


