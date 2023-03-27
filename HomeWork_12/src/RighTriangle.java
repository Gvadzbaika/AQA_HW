public class RighTriangle extends Triangle {

    public RighTriangle(double firstSide, double secondSide){
        super(firstSide, firstSide, secondSide);
    }

    @Override
    public double getSquare() {
        double s = (getFirstSide()*getSecondSide())/2;
        return s;
    }
    @Override
    public double getPerimeter() {
        double p;
        p = getFirstSide()*3;
        return p;
    }
}
