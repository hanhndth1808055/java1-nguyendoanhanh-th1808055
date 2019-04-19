package assignment1;

import java.util.Scanner;

public class Assign1 {
    public int m;
    public int n;

    public void inputNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the number to find all smaller primary number: ");
        n = scanner.nextInt();
    }

    public void showPrimaryNumber() {
        for (m = 2; m < n; m++) {
            if (checkPrimaryNumber(m)) {
                System.out.println(m);
            }
        }
    }

    public boolean checkPrimaryNumber(int m) {
        if (m == 2) {
//            System.out.println("2 is a primary number.");
            return true;
        }

        if (m % 2 == 0) {
//            System.out.println(m + " is not a primary number.");
            return false;
        }
        if (m == 3) {
//            System.out.println("3 is a primary number.");
            return true;
        }

        for (int i = 3; i < m / 2; i += 2) {
            if (m % i == 0) {
//                System.out.println(m + " is not a primary number.");
                return false;
            }
        }
//        System.out.println(m + " is a primary number.");
        return true;
    }
}

