public class Parallelogram extends Quadrilateral {

    Parallelogram(double a, double h){
        super(a,a,h);
    }
        @Override
    public double getArea() {
        double s;
        s = getA()*getH();
        return s;
    }
}
