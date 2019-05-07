package session5inclass190504;

public class IsoscelesTriangle extends Triangle {
    public double equalSides;
    public double theOtherSide;

    public IsoscelesTriangle() {
    }

    public IsoscelesTriangle(double side_1, double side_2, double side_3) {
        super(side_1, side_2, side_3);
        if (!checkTriangle()) {
            System.out.println("Wrong side measurement. Please re-start the program.");
            System.exit(0);
        }
        if (side_1 == side_2) {
            this.equalSides = this.side_1;
            this.theOtherSide = this.side_3;
        } else if (side_2 == side_3) {
            this.equalSides = this.side_2;
            this.theOtherSide = this.side_1;
        } else if (side_1 == side_3) {
            this.equalSides = this.side_1;
            this.theOtherSide = this.side_2;
        }
    }

    public boolean checkTriangle() {
        if (super.checkTriangle()) {
            if (side_1 == side_2 || side_2 == side_3 || side_1 == side_3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public double calculatePerimeter() {
        return (equalSides * 2 + theOtherSide);
    }

    public double calculateArea() {
        return 0.5 * theOtherSide * (Math.sqrt(equalSides * equalSides - (theOtherSide / 2) * (theOtherSide / 2)));
    }
}