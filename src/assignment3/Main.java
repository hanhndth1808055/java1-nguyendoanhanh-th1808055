package assignment3;

public class Main {
    public static void main(String args[]) {
        //Test insert and print function
        System.out.println("Insert and print");
        Fraction fraction1 = new Fraction(3, 0);
        fraction1.printFraction(fraction1);

        //Test flip function
        Fraction fractionA = new Fraction(1, 12);
        System.out.println("Fraction A");
        fractionA.printFraction(fractionA);
        System.out.println("flip");
        fractionA.printFraction(fractionA.flipFraction(fractionA));

        //Test simplifying function
        System.out.println("Simplifying fraction B 2/12");
        Fraction fractionB = new Fraction(2, 12);
        fractionB.simplifyingFraction(fractionB);
        fractionB.printFraction(fractionB);

        //Test add function: fraction A + fraction B
        System.out.println("Adding");
        fractionA.printFraction(fractionA.add(fractionA, fractionB));

        //Test sub function: fraction A - fraction B
        System.out.println("Subtract");
        fractionA.printFraction(fractionA.sub(fractionA, fractionB));

        //Test multiplying function: fraction A*fraction B
        System.out.println("Multiply");
        fractionA.printFraction(fractionA.mul(fractionA, fractionB));

        //Test division function: fraction A/fraction B
        System.out.println("Division");
        fractionA.printFraction(fractionA.div(fractionA, fractionB));
    }
}
