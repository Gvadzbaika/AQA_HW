public class RighTriangle extends Triangle {
    private double a;
    private double b;

    public RighTriangle(double a, double b){
        this.a =a;
        this.b =b;
    }

    @Override
    public double getArea() {
        double s = (a*b)/2;
        return s;
    }
}
