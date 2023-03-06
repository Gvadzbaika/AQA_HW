public class Square extends Quadrilateral {

    public Square(double a) {
        super(a,a,a);
    }
        @Override
    public double getArea() {
        double s;
        s = getA()*getA();
        return s;
    }
    public double getPerimeter() {
        double p;
        p = 4*getA();
        return p;
    }
}
