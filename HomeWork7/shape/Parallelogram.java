public class Parallelogram extends Quadrilateral {
    private double a;
   public double h;

    Parallelogram(double a, double h){
        this.a=a;
        this.h=h;
    }
        @Override
    public double getArea() {
        double s;
        s = a*h;
        return s;
    }
}
