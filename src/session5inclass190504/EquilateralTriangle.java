package session5inclass190504;

public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle() {
    }

    public EquilateralTriangle(double side_1, double side_2, double side_3) {
        super(side_1, side_2, side_3);
        if (!checkTriangle()) {
            System.out.println("Wrong side measurement. Please re-start the program.");
            System.exit(0);
        }
    }

    public boolean checkTriangle() {
        if (super.checkTriangle()) {
            if (side_1 == side_2 && side_2 == side_3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public double calculatePerimeter() {
        return side_1 * 3;
    }

    public double calculateArea() {
        return Math.sqrt(3) * side_1 * side_1 / 4;
    }
}
