public class Square extends Quadrilateral {

    public Square(double firstSide) {
        super(firstSide,firstSide,firstSide,firstSide);
    }
        @Override
    public double getSquare() {
        double s;
        s = getFirstSide()*getFirstSide();
        return s;
    }
    public double getPerimeter() {
        double p;
        p = 4*getFirstSide();
        return p;
    }
}
