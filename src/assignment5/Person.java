package assignment5;

import java.util.Date;
import java.util.Scanner;

public class Person {
    public String name;
    public int age;
    public String gender;
    public String birthday;
    public String address;

    public Person() {
    }

    public Person(String name, int age, String gender, String birthday, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
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
        System.out.println("Please insert age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please insert gender: ");
        String gender = scanner.nextLine();
        System.out.println("Please insert birthday: ");
        String birthday = scanner.nextLine();
        System.out.println("Please insert address: ");
        String address = scanner.nextLine();
        setAge(age);
        setName(name);
        setGender(gender);
        setBirthday(birthday);
        setAddress(address);
    }

    public void showInfor() {
        System.out.println("Customer information:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("DOB: " + getBirthday());
        System.out.println("Address: " + getAddress());
    }
}