package session8;

import session6.PhoneBook;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        PhoneBook p = new PhoneBook();


//        Lamda expression - only 1 method in the Interface
//        Cach 1
        DemoInterface demo = new DemoInterface() {
            @Override
            public void demo() {

            }
        };
//         Cach 2
        DemoInterface demo2 = () -> {
            System.out.println("Demo....");
        };
        demo2.demo();


        // Something

        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("abc");
        arr.add("bac");
        arr.add("aasdf");

        arr.stream().filter(s -> s.startsWith("a"))
                .sorted()
                .forEach(s -> {
                    System.out.println(s);
                });
        LocalDate lD = LocalDate.now();
        for (String str : arr) {
            System.out.println(str);
        }

        Human human = new Human();
        human.run();
        human.eat();
        human.run().eat();

//        Student.setData().save();


        System.out.println("Today: " + lD);
        System.out.println("Next day: " + lD.plusDays(1));
        System.out.println("Next week: " + lD.plusWeeks(1));
        System.out.println("Next month: " + lD.plusMonths(1));

        LocalDate lD2 = LocalDate.of(1997, 2, 20);

        String birthday = "1999-02-20";
        LocalDate lD3 = LocalDate.parse(birthday);
        System.out.println("Birthday: " + lD3);

        LocalDateTime ldt = LocalDateTime.now();


        System.out.println("Now: " + ldt);
        System.out.println("Next: " + ldt.plusHours(2));

        LocalDateTime x = ldt.plusMinutes(20);

        LocalDateTime xy = LocalDateTime.of(1999, 2, 28, 7, 8, 23, 50);

        LocalDateTime timenow = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(timenow, ZoneId.of("Australia/Darwin"));
        System.out.println(zonedDateTime);

        Scanner scanner = new Scanner(System.in);
        System.out.println("FROM: ");
        int from = scanner.nextInt();

        System.out.println("TO: ");
        int to = scanner.nextInt();

        LocalDate nt = LocalDate.of(from, 2, 28);
        for (int j = 0; j <= (to - from); j++) {
            LocalDate year_j = nt.plusYears(j);
            LocalDate next_year_j = year_j.plusDays(1);
            if (next_year_j.getDayOfMonth() == 29) {
                System.out.println(next_year_j.getYear() + " la nam nhuan.");
            }
        }

    }
}
