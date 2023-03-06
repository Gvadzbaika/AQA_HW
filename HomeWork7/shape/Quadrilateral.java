public class Quadrilateral extends Shape {
    private double a;
    private double b;
    private double h;

    public Quadrilateral(double a, double b){
        this.a=a;
        this.b=b;
    }
    public Quadrilateral(double a, double b, double h){
        this.a=a;
        this.b=b;
        this.h=h;
    }


    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getH() {
        return h;
    }
}
