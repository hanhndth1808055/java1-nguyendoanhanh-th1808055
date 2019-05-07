package session5;

public class Main {
    public static void main(String args[]) {
        Human h = new Human();
        h.eat();
        Asian as = new Asian();
        as.name = "Le Van Nam";
        as.eat();

        as.run();
        as.run(50);
        as.run(4, "Hello");

        as.eat();

        Vietnam vn = new Vietnam();
        vn.language = "Vietnamese";
        vn.eat();
    }
}
