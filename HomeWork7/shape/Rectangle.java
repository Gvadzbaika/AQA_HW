public class Rectangle extends Quadrilateral {


    public Rectangle(double a, double b){
       super(a,a,b);
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
