public class Diamond extends Quadrilateral {

   public Diamond(double a) {
       super(a,a,a,a);
    }

    public double getPerimeter() {
        double p;
        p = 4*getA();
        return p;
    }
}
