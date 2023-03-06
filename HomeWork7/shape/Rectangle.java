public class Rectangle extends Quadrilateral {
   private double a;
   private double b;

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }
        @Override
    public double getArea() {
        double s;
        s = a*b;
        return s;
    }
    public double getPerimeter() {
        double p;
        p = (a+b)*2;
        return p;
    }
}
