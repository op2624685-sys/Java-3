package projects.GeometryApp.utils;

import projects.GeometryApp.geometry.Circle;
import projects.GeometryApp.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.6);
        Rectangle rectangle = new Rectangle(10, 4);

        double circleArea = Math.PI * Math.pow(circle.radius, 2);
        double rectangleArea = rectangle.length * rectangle.width;

        System.out.println("Rectangle is :- " + rectangleArea);
        System.out.println("Circle is :- " + circleArea);
    }

}
