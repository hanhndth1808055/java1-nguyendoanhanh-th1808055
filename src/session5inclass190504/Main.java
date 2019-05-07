package session5inclass190504;

public class Main {
    public static void main(String args[]) {
        Triangle triangle = new Triangle(2, 3, 4);
        triangle.printPerimeterAndArea();

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(3, 3, 4);
        isoscelesTriangle.printPerimeterAndArea();
        System.out.println("Isosceles Triangle Perimeter: " + isoscelesTriangle.calculatePerimeter());
        System.out.println("Isosceles Triangle Area: " + isoscelesTriangle.calculateArea());

        RightTriangle rightTriangle = new RightTriangle(3, 4, 5);
        rightTriangle.printPerimeterAndArea();
        System.out.println("Right Triangle Area: " + rightTriangle.calculateArea());

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(3, 3, 3);
        equilateralTriangle.printPerimeterAndArea();
        System.out.println("Equilateral Triangle Perimeter: " + equilateralTriangle.calculatePerimeter());
        System.out.println("Equilateral Triangle Area: " + equilateralTriangle.calculateArea());

    }
}
