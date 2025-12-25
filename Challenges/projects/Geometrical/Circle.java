package projects.Geometrical;

public class Circle extends Shape{
    private double radiusOfCircle;
    
    public Circle(double radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }

    public double getRadiusOfCircle() {
        return radiusOfCircle;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusOfCircle, 2) ;
    }
}
