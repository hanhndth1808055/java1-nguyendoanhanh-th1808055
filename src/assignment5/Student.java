package assignment5;

import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, String gender, LocalDate birthday, String address) {
        super(name, gender, birthday, address);
    }

    public boolean checkAge18(LocalDate birthday) {
        LocalDate age18dob = LocalDate.parse("2000-12-31");
        if (birthday.compareTo(age18dob) > 0) {
            System.out.println("This student is not 18 yet. Please re-insert.");
            return false;
        } else {
            System.out.println("This student is 18 or more.");
            return true;
        }
    }

    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert name: ");
        String name = scanner.nextLine();
        System.out.println("Please insert gender: ");
        String gender = scanner.nextLine();
        LocalDate birthday;
        do {
            System.out.println("Please insert birthday: ");
            birthday = LocalDate.parse(scanner.nextLine());
        } while (!checkAge18(birthday));


        System.out.println("Please insert address: ");
        String address = scanner.nextLine();


        setName(name);
        setGender(gender);
        setBirthday(birthday);
        setAddress(address);
    }

}


