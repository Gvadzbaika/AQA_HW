
public class EquilateralTriangle extends Triangle {

        public EquilateralTriangle(double firstSide){
        super(firstSide,firstSide,firstSide);
    }
    @Override
    public double getSquare() {
            double s = Math.sqrt(3)/4*Math.pow(getFirstSide(),2);
            return s;
    }
    @Override
    public double getPerimeter() {
        double p;
        p = getFirstSide()*3;
        return p;
    }
}
