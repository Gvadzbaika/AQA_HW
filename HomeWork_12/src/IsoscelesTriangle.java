public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double firstSide, double secondSide){
     super(firstSide,firstSide,secondSide);
    }
    public double getSquare() {
        double s = 0.5*getSecondSide()*Math.sqrt((getFirstSide()+0.5*getSecondSide())*(getFirstSide()-0.5*getFirstSide()));
        return s;
    }
    @Override
    public double getPerimeter() {
        double p;
        p = getFirstSide()*2+getSecondSide();
        return p;
    }
}
