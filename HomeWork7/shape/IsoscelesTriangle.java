public class IsoscelesTriangle extends Triangle {
    private double a;
    private double b;
    public IsoscelesTriangle(double a, double b){
        this.a=a;
        this.b=b;
    }
    public double getArea() {
        double s = 0.5*b*Math.sqrt((a+0.5*b)*(a-0.5*b));
        return s;
    }
}
