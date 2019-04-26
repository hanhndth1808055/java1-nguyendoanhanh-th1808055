package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    public String name;
    public String location;
    public ArrayList<String> userList;

    public Room() {
        this.userList = new ArrayList<>();
    }

    public Room(String name, String location, ArrayList<String> userList) {
        this.name = name;
        this.location = location;
        this.userList = new ArrayList<>();
    }
public void addRoom(Room room){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert room's name: ");
    room.name = scanner.nextLine();
//        System.out.println(room.name);
    System.out.println("Please insert room's location: ");
    room.location = scanner.nextLine();

}
    public void addUser(int n, Room room) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Please insert room's " + " user number " + (i + 1) + ": ");
            room.userList.add(scanner.nextLine());
        }
    }

    public void printRoom(Room room) {
        System.out.println("Room's name: " + room.name);
        System.out.println("Room's location: " + room.location);
        System.out.println("Room's user list: ");
        for (String u : userList) {
            System.out.println(u);
        }
    }
    public void deleteUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert index to delete user: ");
        int a = scanner.nextInt();
        userList.remove(a);
    }
}

