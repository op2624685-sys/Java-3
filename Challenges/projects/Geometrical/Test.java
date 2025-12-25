package projects.Geometrical;

public class Test {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Square squ = new Square(12);

        System.out.println("Area of circle is :- " + cir.calculateArea());
        System.out.println("Area of square is :- " + squ.calculateArea());
    }
}
