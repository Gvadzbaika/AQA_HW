public class EquilateralTriangle extends Triangle {

        public EquilateralTriangle(double a){
        super(a,a,a);
    }
    @Override
    public double getArea() {
            double s = Math.sqrt(3)/4*Math.pow(getA(),2);
            return s;
    }
}
