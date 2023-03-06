public class Square extends Quadrilateral {
    private double a;
    public Square(double a) {
        this.a = a;
    }
        @Override
    public double getArea() {
        double s;
        s = a*a;
        return s;
    }
    public double getPerimeter() {
        double p;
        p = 4*a;
        return p;
    }
}
