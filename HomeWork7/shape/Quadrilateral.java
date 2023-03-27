public class Quadrilateral extends Shape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double foursSide;

    public Quadrilateral(double firstSide, double secondSide, double thirdSide, double foursSide){
        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.thirdSide=thirdSide;
        this.foursSide=foursSide;
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

    public double getFoursSide() {
        return foursSide;
    }
    @Override
    public double getArea() {
        double s;
        s = getFirstSide()*getSecondSide();
        return s;
    }

    @Override
    public double getPerimeter() {
        double p;
        p = (getFirstSide()+getSecondSide())*2;
        return p;
    }
}
