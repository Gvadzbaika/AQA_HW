public class Diamond extends Quadrilateral {
   private double a;
   private double h;

   public Diamond(double a, double h) {
        this.a = a;
    }
       @Override
    public double getArea() {
        double s;
        s = a*h;
        return s;
    }
    public double getPerimeter() {
        double p;
        p = 4*a;
        return p;
    }
}
