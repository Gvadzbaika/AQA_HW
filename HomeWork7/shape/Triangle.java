public class Triangle extends Shape {

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double c) {
        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.secondSide=secondSide;
    }


    public double getFirstSide() {
        return firstSide;
    }
    public double getSecondSide() {
        return secondSide;
    }
    public double getThirdSide() {
        return thirdSide;
    }
    @Override
    public double getArea() {
        double p = 0.5 * (getFirstSide() + getSecondSide() + getThirdSide());
        double s = Math.sqrt(p * (p - getFirstSide()) * (p - getSecondSide()) * (p - getThirdSide()));
        return s;
    }

    @Override
    public double getPerimeter() {
        double p;
        p = (getFirstSide()+getSecondSide()+getThirdSide());
        return p;
    }
}

