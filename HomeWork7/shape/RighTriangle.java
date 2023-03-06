public class RighTriangle extends Triangle {

    public RighTriangle(double a, double b){
        super(a, a, b);
    }

    @Override
    public double getArea() {
        double s = (getA()*getB())/2;
        return s;
    }
}
