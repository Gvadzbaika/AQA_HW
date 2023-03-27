
public class Circle extends Shape {
    private double radius;

     public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getSquare() {
        double s;
       s = Math.PI * (radius * radius);
        return s;
    }
    public double getDiameterOfCircle() {
        double d;
        d = radius*2;
        return d;
    }
    @Override
    public double getPerimeter() {
        double circumference;
        circumference= Math.PI*2*radius;
        return circumference;
    }
}
