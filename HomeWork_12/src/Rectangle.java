public class Rectangle extends Quadrilateral {


    public Rectangle(double firstSide, double secondSide){
       super(firstSide,secondSide,firstSide,secondSide);
    }
    @Override
    public double getSquare() {
        double s;
        s = getFirstSide()*getSecondSide();
        return s;
    }
    @Override
    public double getPerimeter() {
        double p;
        p = (getFirstSide()+getSecondSide())*2;
        return p;
    }
}
