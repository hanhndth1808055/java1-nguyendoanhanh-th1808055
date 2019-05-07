package session5inclass190504;

public class RightTriangle extends Triangle {
    public double hypotenuse;
    public double otherSide1;
    public double otherSide2;

    public RightTriangle() {
    }

    public RightTriangle(double side_1, double side_2, double side_3) {
        super(side_1, side_2, side_3);
        if (!checkTriangle()) {
            System.out.println("Wrong side measurement. Please re-start the program.");
            System.exit(0);
        }
        if (side_1 > side_2 && side_1 > side_3) {
            this.hypotenuse = side_1;
            this.otherSide1 = side_2;
            this.otherSide2 = side_3;
        }
        if (side_2 > side_1 && side_2 > side_3) {
            this.hypotenuse = side_2;
            this.otherSide1 = side_1;
            this.otherSide2 = side_3;
        }
        if (side_3 > side_1 && side_3 > side_2) {
            this.hypotenuse = side_3;
            this.otherSide1 = side_1;
            this.otherSide2 = side_2;
        }
    }

    public boolean checkTriangle() {
        if (super.checkTriangle()){
            if (side_1 * side_1 == (side_2 * side_2 + side_3 * side_3) || side_2 * side_2 == (side_1 * side_1 + side_3 * side_3) || side_3 * side_3 == (side_1 * side_1 + side_2 * side_2)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public double calculateArea(){
        return 0.5*this.otherSide1*this.otherSide2;
    }
}
