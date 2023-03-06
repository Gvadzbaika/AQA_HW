public class Diamond extends Quadrilateral {

   public Diamond(double a, double h) {
       super(a,a,h);
    }
       @Override
    public double getArea() {
        double s;
        s = getA()*getH();
        return s;
    }
    public double getPerimeter() {
        double p;
        p = 4*getA();
        return p;
    }
}
