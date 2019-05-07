package session5inclass190504;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
    public double side_1;
    public double side_2;
    public double side_3;

    public Triangle() {
    }

    public Triangle(double side_1, double side_2, double side_3) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
        for (;;){
            if (!checkTriangle()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please insert side 1: ");
                this.side_1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Please insert side 2: ");
                this.side_2 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Please insert side 3: ");
                this.side_3 = scanner.nextDouble();
                scanner.nextLine();
            } else {
                System.out.println("Insert successfully.");
                break;
            }
        }

    }

    public boolean checkTriangle(){
        if (side_1 <= 0 || side_2 <= 0 || side_3 <= 0 || side_1 + side_2 <= side_3 || side_1 + side_3 <= side_2 || side_2 + side_3 <= side_1) {
            return false;
        }
        return true;
    }

    public double calculatePerimeter() {
        return side_1 + side_2 + side_3;
    }

    public double calculateArea() {
        return Math.sqrt((side_1 + side_2 + side_3) * (side_1 + side_2 - side_3) * (side_2 + side_3 - side_1) * (side_3 + side_1 - side_2)) / 4;
    }

    public void printPerimeterAndArea() {
        System.out.println("The perimeter is: " + calculatePerimeter());
        System.out.println("The area is: " + calculateArea());
    }

}
