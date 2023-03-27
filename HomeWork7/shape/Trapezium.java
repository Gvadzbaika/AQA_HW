import rectangle.Quadrilateral;

public class Trapezium extends Quadrilateral {
    public Trapezium(double a, double b, double c, double d){
        super(a, b, c,b);
    }

       @Override
    public double getArea() {
        double s;
        s = 0.25*(((getFirstSide()+getFirstSide())/(getSecondSide()-getSecondSide())))*Math.sqrt((-getFirstSide()
                +getSecondSide()+getThirdSide()+getFoursSide())
                *(getFirstSide()-getSecondSide()+getThirdSide()-getFoursSide())*(getFirstSide()-getSecondSide()
                -getThirdSide()+getFoursSide()));
        return s;
    }
     public double getPerimeter() {
         double p;
         p = getFirstSide()+getSecondSide()+getThirdSide()+getFoursSide();
         return p;
     }
}
