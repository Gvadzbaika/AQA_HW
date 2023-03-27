public class Diamond extends Quadrilateral {

   public Diamond(double firstSide) {
       super(firstSide,firstSide,firstSide,firstSide);
    }

    @Override
    public double getPerimeter() {
        double p;
        p = 4*getFirstSide();
        return p;
    }
    @Override
    public double getSquare() {
        double s;
        s = getFirstSide()*getSecondSide();
        return s;
    }
}
