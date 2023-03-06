public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double a, double b){
     super(a,a,b);
    }
    public double getArea() {
        double s = 0.5*getB()*Math.sqrt((getA()+0.5*getB())*(getA()-0.5*getB()));
        return s;
    }
}
