package assignment1;

import java.util.Scanner;

public class Assign2 {
    public int x;

    public void inputNumberF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the number of Fibonacci numbers: ");
        x = scanner.nextInt();
    }

    public int findFibonacci(int a) {
        int m = 1;
        int n = 0;
        int temp;

        while(a > 0){
            temp = m;
            m = m + n;
            n = temp;
            a--;
        }
        return n;
    }

    public int totalFibonacci(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += findFibonacci(i);
        }
//        System.out.println(sum);
        return sum;
    }
}
