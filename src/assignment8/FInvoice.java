package assignment8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FInvoice extends ForeignCustomer implements ICustomer {
    public ArrayList<ForeignCustomer> ForeignI = new ArrayList<>();

    public void insertCustomer() {
        System.out.println("---Please insert a Foreigner Customer's invoice---");
        System.out.println("Please insert customer ID: ");
        Scanner scanner = new Scanner(System.in);
        int customerID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please insert customer's name: ");
        String name = scanner.nextLine();
        System.out.println("Please insert invoice date: ");
        String date = scanner.nextLine();
        LocalDate invoiceDate = LocalDate.parse(date);
        System.out.println("Please insert customer's nationality: ");
        String nationality = scanner.nextLine();
        System.out.println("Please insert the quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
//        Customer c = new Customer(customerID, name, invoiceDate, quantity, totalAmount);
        ForeignCustomer c = new ForeignCustomer(customerID, name, invoiceDate, quantity, nationality);
        ForeignI.add(c);
    }

    public void showCustomer() {
        for (ForeignCustomer v : ForeignI) {
            System.out.println(v.customerID + " - " + v.name + " - " + v.invoiceDate + " - " + v.nationality + " - " + v.quantity + " - " + v.totalAmount);
        }
        return;
    }

    public int countForeignCustomer() {
        int n = ForeignI.size();
        for (int i = 0; i < ForeignI.size(); i++) {
            for (int j = i + 1; j < (ForeignI.size() - 1); j++) {
                if (ForeignI.get(i).customerID == ForeignI.get(j).customerID) {
                    n = n - 1;
                }
            }
        }
        return n;
    }

    public float averageAmountForeignCustomer() {
        float total = 0;
        float average;
        for (ForeignCustomer f : ForeignI) {
            total = total + f.totalAmount;
        }
        average = total / ForeignI.size();
        return average;
    }

    public void exportInvoice() {
        for (ForeignCustomer v : ForeignI) {
            if (v.invoiceDate.compareTo(LocalDate.parse("2019-01-01")) >= 0 && v.invoiceDate.compareTo(LocalDate.parse("2019-01-31")) <= 0) {
                System.out.println(v.customerID + " - " + v.name + " - " + v.invoiceDate + " - " + v.nationality + " - " + v.quantity + " - " + v.totalAmount);
            }
        }
        return;
    }
}
