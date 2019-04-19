package assignment1;

public class Main {
    public static void main(String args[]) {
        Assign2 assign2 = new Assign2();
        assign2.inputNumberF();
//        System.out.println(assign2.findFibonacci(assign2.x));
        System.out.println("The sum of " + assign2.x + " numbers of Fibonacci sequence is "  + assign2.totalFibonacci(assign2.x));

        Assign1 assign1 = new Assign1();
        assign1.inputNumber();
        System.out.println("All primary numbers: ");
        assign1.showPrimaryNumber();
    }
}
