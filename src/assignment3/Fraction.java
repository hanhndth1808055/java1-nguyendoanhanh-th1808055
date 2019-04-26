package assignment3;

import java.util.Scanner;
import java.lang.Math;
public class Fraction {
    public int numerator;
    public int denominator;

    public Fraction() {

    }

    public Fraction(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            System.out.println("Denominator can't be zero. Please re-run.");
            insertFraction();
        }
    }


    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void insertFraction() {
        int a;
        int b;
        for (; ; ) {
            System.out.println("Please insert the numerator: ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please insert the denominator: ");
            b = scanner.nextInt();
            if (b != 0) {
                setNumerator(a);
                setDenominator(b);
                break;
            } else {
                System.out.println("Denominator can't be zero. Please re-run.");
            }
        }
    }

    public void printFraction(Fraction fraction) {
        System.out.println("The fraction is: " + fraction.getNumerator() + "/" + fraction.getDenominator());
    }

    public int findGreatestCommonDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a*b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return Math.abs(a) + Math.abs(b);
    }

    public Fraction simplifyingFraction(Fraction fraction1) {
        int gcd = findGreatestCommonDivisor(fraction1.getNumerator(), fraction1.getDenominator());
        fraction1.setNumerator(getNumerator() / gcd);
        fraction1.setDenominator(getDenominator() / gcd);
        return fraction1;
    }

    public Fraction flipFraction(Fraction fraction1) {
        Fraction fraction2 = new Fraction();
        fraction2.setNumerator(fraction1.getDenominator());
        fraction2.setDenominator(fraction1.getNumerator());
        return fraction2;
    }

    public Fraction add(Fraction fraction1, Fraction fraction2) {
        Fraction addFraction = new Fraction();
        int a;
        int b;
        int c;
        int d;
        a = fraction1.getNumerator();
        b = fraction1.getDenominator();
        c = fraction2.getNumerator();
        d = fraction2.getDenominator();
        addFraction.setNumerator(a * d + c * b);
        addFraction.setDenominator(b * d);
        addFraction.simplifyingFraction(addFraction);
        return addFraction;
    }

    public Fraction sub(Fraction fraction1, Fraction fraction2) {
        Fraction subFraction = new Fraction();
        int a;
        int b;
        int c;
        int d;
        a = fraction1.getNumerator();
        b = fraction1.getDenominator();
        c = fraction2.getNumerator();
        d = fraction2.getDenominator();
        subFraction.setNumerator(a * d - c * b);
        subFraction.setDenominator(b * d);
        subFraction.simplifyingFraction(subFraction);
        return subFraction;
    }

    public Fraction mul(Fraction fraction1, Fraction fraction2) {
        Fraction mulFraction = new Fraction();
        int a;
        int b;
        int c;
        int d;
        a = fraction1.getNumerator();
        b = fraction1.getDenominator();
        c = fraction2.getNumerator();
        d = fraction2.getDenominator();
        mulFraction.setNumerator(a * c);
        mulFraction.setDenominator(b * d);
        mulFraction.simplifyingFraction(mulFraction);
        return mulFraction;
    }


    public Fraction div(Fraction fraction1, Fraction fraction2) {
        Fraction divFraction = new Fraction();
        int a;
        int b;
        int c;
        int d;
        a = fraction1.getNumerator();
        b = fraction1.getDenominator();
        c = fraction2.getNumerator();
        d = fraction2.getDenominator();
        divFraction.setNumerator(a * d);
        divFraction.setDenominator(b * c);
        divFraction.simplifyingFraction(divFraction);
        return divFraction;
    }
}
