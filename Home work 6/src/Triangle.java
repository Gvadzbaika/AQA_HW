public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double perimeterOfTriangle() {
        double p = a + b + c;
        return p;
    }
    //По формуле Герона
    public double squareOfTriangle() {
        double p = 0.5 * (a + b + c);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}
