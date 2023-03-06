public class Trapezium extends Quadrilateral {
    public Trapezium(double a, double b, double h){
        super(a, b, h);
    }
       @Override
    public double getArea() {
        double s;
        s = (getA()+getB())/2*getH();
        return s;
    }
}
