public class EquilateralTriangle extends Triangle {
    private double a;

        public EquilateralTriangle(double a){
        this.a=a;
    }
    @Override
    public double getArea() {
            double s = Math.sqrt(3)/4*Math.pow(a,2);
            return s;
    }
}
