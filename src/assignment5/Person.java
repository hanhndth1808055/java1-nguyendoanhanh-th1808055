package assignment5;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public LocalDate birthday;
    public String address;

    public Person() {
    }

    public Person(String name, String gender, LocalDate birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    };


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert name: ");
        String name = scanner.nextLine();
        System.out.println("Please insert gender: ");
        String gender = scanner.nextLine();
        System.out.println("Please insert birthday: ");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        System.out.println("Please insert address: ");
        String address = scanner.nextLine();
        setName(name);
        setGender(gender);
        setBirthday(birthday);
        setAddress(address);
    }

    public void showInfor() {
        System.out.println("Customer information:");
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("DOB: " + getBirthday());
        System.out.println("Address: " + getAddress());
    }
}