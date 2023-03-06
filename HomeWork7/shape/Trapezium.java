public class Trapezium extends Quadrilateral {
    private double a;
    private double b;
   private double h;

    public Trapezium(double a, double b, double h){
        this.a=a;
        this.b=b;
        this.h=h;
    }
       @Override
    public double getArea() {
        double s;
        s = (a+b)/2*h;
        return s;
    }
}
