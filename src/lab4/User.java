package lab4;

import java.util.ArrayList;

public class User {
    public int id;
    public String name;
    public String email;
    public String password;
    public ArrayList<String> gallery;
//    public ArrayList<String> gallery = new ArrayList<>();

    public User() {
        this.gallery = new ArrayList<>();
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gallery = new ArrayList<String>();
    }

    public static void main(String args[]) {
        User userX = new User();
        userX.gallery.add("https://google.com/skdjsk.jpg");

        User[] arrayUsers = new User[10];
        for (int i = 0; i < 10; i++) {
            arrayUsers[i] = new User(i + 1, "Le Van A", "aa@gmail.com", "123456");
        }
        for(User u: arrayUsers){
            System.out.println("ID: " + u.id);
            System.out.println("Name: " + u.name);
            System.out.println("Email: " + u.email);
            System.out.println("password: " + u.password);
        }

        //ArrayList
        ArrayList<User> userArray = new ArrayList<>();
        for (int i = 0; i <10; i++){
            userArray.add(new User(i + 1, "Le Van A", "aa@gmail.com", "123456"));
        }
        // Xpa 1 element khoi arrayList
        userArray.remove(2); // Xoa element co index = 2
        for(User u: userArray){
            System.out.println("ID: " + u.id);
            System.out.println("Name: " + u.name);
            System.out.println("Email: " + u.email);
            System.out.println("password: " + u.password);
        }
    }
}
