package rozdzial8.Zadania_Programistyczne.Zadanie4_LandTract;

//this class create an object for plot and calculate its area

public class LandTract {

    private double width;
    private double length;

    public LandTract() {
        this.width = 0.0;
        this.length = 0.0;
    }

    public LandTract(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //Calculate plot area
    public double getArea() {
        return width*length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Equals method that can be used to compare two objects
    // and confirm does area for 1st object is the same as 2nd one
    public boolean equals(LandTract object2) {

        boolean status;
        if(getArea() == object2.getArea()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    //displaying a message for plot are
    public String toString() {
        return "Powierzchnia wynosi: " + getArea();
    }
}
