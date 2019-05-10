package assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList {
    public ArrayList<Student> StudentList = new ArrayList<>();

    public void addStudent() {
        Student st = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Insert Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please Insert Student's Name: ");
        String name = scanner.nextLine();
        System.out.println("Please Insert Student's Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please Insert Student's Address: ");
        String address = scanner.nextLine();
        System.out.println("Please Insert Student's GPA: ");
        Float gpa = scanner.nextFloat();
        scanner.nextLine();
        st.id = id;
        st.name = name;
        st.age = age;
        st.address = address;
        st.gpa = gpa;

        StudentList.add(st);
        showStudent();

    }

    public void editStudent(int id) {
        for (Student s : StudentList) {
            if (s.id == id) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please Insert Student ID: ");
                id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please Insert Student's Name: ");
                String name = scanner.nextLine();
                System.out.println("Please Insert Student's Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please Insert Student's Address: ");
                String address = scanner.nextLine();
                System.out.println("Please Insert Student's GPA: ");
                float gpa = scanner.nextFloat();
                scanner.nextLine();
                s.id = id;
                s.name = name;
                s.age = age;
                s.address = address;
                s.gpa = gpa;
            }
        }
//        for (Student s : StudentList) {
//            System.out.println("Student ID " + s.id + ": " + s.name + " - " + s.age + " - " + s.address + " - " + s.gpa);
//        }
    }

    public void deleteStudent(int id) {
//        for (int i = 0; i < StudentList.size(); i++) {
//            if (StudentList.get(i).id == id) {
//                StudentList.remove(i);
//            }
//        }
        for (Student s : StudentList) {
            if (s.id == id) {
                StudentList.remove(s);
                return;
            }
        }
    }

    public void showStudent() {
        for (Student s : StudentList) {
            System.out.println("Student ID " + s.id + ": " + s.name + " - " + s.age + " - " + s.address + " - " + s.gpa);
        }
    }

    public void sortGPA() {
        Collections.sort(StudentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.gpa.compareTo(o2.gpa);
            }
        });
        for (Student s : StudentList) {
            System.out.println("Student ID " + s.id + ": " + s.name + " - " + s.age + " - " + s.address + " - " + s.gpa);
        }
    }

    public void sortName() {
        Collections.sort(StudentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (Student s : StudentList) {
            System.out.println("Student ID " + s.id + ": " + s.name + " - " + s.age + " - " + s.address + " - " + s.gpa);
        }
    }
}
