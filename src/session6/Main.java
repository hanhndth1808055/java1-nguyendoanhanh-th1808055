package session6;

public class Main {
    public static void main(String args[]) {
        PhoneBook phoneBook = new PhoneBook();
        System.out.println("-----------Check insert function-----------");
        phoneBook.insertPhone("Le Van A", "0966977669");
        phoneBook.insertPhone("Le Van A", "0966977669");
        phoneBook.insertPhone("Le Van A", "0966977668");
        phoneBook.insertPhone("Nguyen Van B", "09632432445");
        phoneBook.insertPhone("Tran Mai C", "09632432446");
        phoneBook.printPhone();
        System.out.println("-----------Check remove function: Remove Nguyen Van B-----------");
        phoneBook.removePhone("Nguyen Van B");
        phoneBook.printPhone();
        System.out.println("-----------Check update function: Tran Mai C => 09632430000-----------");
        phoneBook.updatePhone("Tran Mai C", "09632430000");
        phoneBook.printPhone();
        System.out.println("-----------Check search Le Van A:-----------");
        phoneBook.searchPhone("Le Van A");
        phoneBook.insertPhone("Chu Thi D", "0966974668");
        phoneBook.insertPhone("Trinh Thi E", "09632434441");
        phoneBook.insertPhone("Le Tuyet Mai F", "096324324234");
        System.out.println("-----------Check sorting: Original-----------");
        phoneBook.printPhone();
        System.out.println("-----------Check sorting: Sorted-----------");
        phoneBook.sort();
    }
}
