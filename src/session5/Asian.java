package session5;

public class Asian extends Human {
    public String language;

    public void run() {
        System.out.println("running 5km/h");
    }

    public Asian() {

    }

    public Asian(String name, int age, String language) {
        super(name, age);
        this.language = language;
    }

    public void run(int x) {

    }

    public void run(int x, int y) {

    }

    public void run(String x) {

    }

    public void run(int x, String y) {

    }

    public void eat() {
        super.eat();
        System.out.println("an com...");
    }
}
