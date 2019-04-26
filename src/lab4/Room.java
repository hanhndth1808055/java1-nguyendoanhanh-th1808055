package lab4;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    public String name;
    public String location;
    public ArrayList<User> userList;

    public Room() {
        this.userList = new ArrayList<>();
    }

    public Room(String name, String location, ArrayList<String> userList) {
        this.name = name;
        this.location = location;
        this.userList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert room's name: ");
        room.name = scanner.nextLine();
//        System.out.println(room.name);
        System.out.println("Please insert room's location: ");
        room.location = scanner.nextLine();

    }

    public void addUser(Room room) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert user's id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please insert user's name");
        String name = scanner.nextLine();

        System.out.println("Please insert user's email");
        String email = scanner.nextLine();

        System.out.println("Please insert user's password");
        String password = scanner.nextLine();

        System.out.println("Please insert user's gallery");
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Please insert URL of picture: ");
            stringList.add(scanner.nextLine());
        }

        User user = new User(id, name, email, password);
        user.gallery = stringList;

        userList.add(user);

    }


    public void printRoom(Room room) {
        System.out.println("Room's name: " + room.name);
        System.out.println("Room's location: " + room.location);
        System.out.println("Room's user list: ");
        for (User u : userList) {
            System.out.println("ID: " + u.id);
            System.out.println("Name: " + u.name);
            System.out.println("Email: " + u.email);
            System.out.println("Password: " + u.password);

            System.out.println("~~~~~~~~~~~~~");
        }
    }

    public void deleteUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert id to delete user: ");
        int id = scanner.nextInt();
        for (int i = 0; i < userList.size(); i++){
            if(userList.get(i).id == id){
                userList.remove(i);
            }
        }
//        System.out.println("Insert name to delete user: ");
//        String name = scanner.nextLine();
//        for (int i = 0; i < userList.size(); i++){
//            if(userList.get(i).name.equals(name)){
//                userList.remove(i);
//            }
//        }
////        userList.remove(a);
    }
}

