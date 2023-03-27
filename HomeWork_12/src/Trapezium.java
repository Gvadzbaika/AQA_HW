public class Trapezium extends Quadrilateral {
    public Trapezium(double firstSide, double secondSide, double thirdSide, double foursSide){
        super(firstSide, secondSide, thirdSide,foursSide);
    }

       @Override
    public double getSquare() {
           double s=((getFirstSide()+getSecondSide())*Math.sqrt(Math.pow(getThirdSide(),2)-
                   Math.pow((getFirstSide()-getSecondSide())/2,2)))/2;
        return s;
    }
     public double getPerimeter() {
         double p;
         p = getFirstSide()+getSecondSide()+getThirdSide()+getFoursSide();
         return p;
     }
}
