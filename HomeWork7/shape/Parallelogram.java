public class Parallelogram extends Quadrilateral {

    Parallelogram(double a, double b){
        super(a,b,a,b);
    }

    @Override
    public double getArea() {
        double s;
        s = getA()*getB();
        return s;
    }
    public double getPerimeter() {
        double p;
        p = (getA()+getB())*2;
        return p;
    }
}
