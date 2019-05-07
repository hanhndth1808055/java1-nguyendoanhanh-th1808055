package assignment5;

import java.util.Scanner;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age, String gender, String birthday, String address) {
        super(name, age, gender, birthday, address);
    }

    public boolean checkAge18() {
        if (this.age < 18) {
            System.out.println("This student is not 18 yet. Please re-insert.");
            return false;
        }
        System.out.println("This student is 18 or more.");
        return true;
    }

    public void setAge() {
        System.out.println("Please re-insert age: ");
        Scanner scanner = new Scanner(System.in);
        setAge(scanner.nextInt());
        scanner.nextLine();
    }
}

