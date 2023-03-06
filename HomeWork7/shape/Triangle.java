public class Triangle extends Shape{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }


    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    @Override
    public double getArea() {
        double p = 0.5 * (a + b + c);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}

