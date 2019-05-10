package assignment7;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        StudentList s = new StudentList();
        for (; ; ) {
            System.out.println("-----------------MENU-----------------");
            System.out.println("1. Add a student");
            System.out.println("2. Delete a student by ID");
            System.out.println("3. Edit a student by ID");
            System.out.println("4. Sort student by GPA");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------");
            System.out.println("Please insert your choice from 0 to 6: ");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            if (selection == 1) {
                s.addStudent();
            } else if (selection == 2) {
                System.out.println("Please insert the student's ID to delete: ");
                int idToDelete = scanner.nextInt();
                s.deleteStudent(idToDelete);
            } else if (selection == 3) {
                System.out.println("Please insert the student's ID to edit: ");
                int idToEdit = scanner.nextInt();
                s.deleteStudent(idToEdit);
            } else if (selection == 4) {
                s.sortGPA();
            } else if (selection == 5) {
                s.sortName();
            } else if (selection == 6) {
                s.showStudent();
            } else if (selection == 0) {
                System.out.println("Exited.");
                return;
            } else {
                System.out.println("Option should be from 0 to 6.");
            }
        }
    }

}
