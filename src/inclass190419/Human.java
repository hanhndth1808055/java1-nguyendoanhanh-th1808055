package inclass190419;

import java.util.Scanner;

public class Human {
    public String name;
    public int age;
    public String country;

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();

        System.out.println("Tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dat nuoc: ");
        country = scanner.nextLine();
    }
    public void showInfo(){
        System.out.println("Tem: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dat nuoc: " + country);
    }
}
