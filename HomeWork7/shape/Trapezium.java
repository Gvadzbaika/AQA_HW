 public class Trapezium extends Quadrilateral {
    public Trapezium(double a, double b, double c, double d){
        super(a, b, c,b);
    }

       @Override
    public double getArea() {
        double s;
        s = 0.25*(((getB()+getA())/(getB()-getA())))*Math.sqrt((-getA()+getB()+getC()+getD())
                *(getA()-getB()+getC()-getD())*(getA()-getB()-getC()+getD()));
        return s;
    }
     public double getPerimeter() {
         double p;
         p = getA()+getB()+getC()+getD();
         return p;
     }
}
