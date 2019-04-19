package inclass190419;

import java.util.Scanner;

public class Rectangle {
    public double x;
    public double y;
    public double p;
    public double s;

    public void inputSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the first side: ");
        x = scanner.nextDouble();
        scanner.nextLine();
        for (; ; ) {
            if (x <= 0) {
                System.out.println("Sides cannot be smaller or equal to 0. Please re-enter it:");
                x = scanner.nextDouble();
                scanner.nextLine();
            } else {
                break;
            }
        }
        System.out.println("Please input the second side: ");
        y = scanner.nextDouble();
        scanner.nextLine();
        for (; ; ) {
            if (y <= 0) {
                System.out.println("Sides cannot be smaller or equal to 0. Please re-enter it:");
                y = scanner.nextDouble();
                scanner.nextLine();
            } else {
                break;
            }
        }
    }

    public void showPerimeter() {
        System.out.println("Perimeter is: " + 2*(x + y));
    }


    public void showArea() {
        System.out.println("Area is: " + x*y);
    }

}
