package assignment6;

public class Main {
    public static void main(String args[]) {
        News n = new News(12, "Get to the highway", "2016-07-08", "Nguyen Van A", "This is a long story of...");
        n.Display();
        System.out.println(n.Calculate());
    }
}
