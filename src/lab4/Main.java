package lab4;

public class Main {
    public static void main(String args[]) {
        Room room = new Room();
        room.addRoom(room);
        room.addUser(5, room);
        room.printRoom(room);
        room.deleteUser();
        room.printRoom(room);
    }
}
