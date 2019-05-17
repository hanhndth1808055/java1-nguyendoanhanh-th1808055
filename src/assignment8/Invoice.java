package assignment8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Invoice extends VietnameseCustomer implements ICustomer {
    public ArrayList<VietnameseCustomer> VietnamI = new ArrayList<>();

    public void insertCustomer() {
        System.out.println("---Please insert a Vietnamese Customer's invoice---");
        System.out.println("Please insert customer ID: ");
        Scanner scanner = new Scanner(System.in);
        int customerID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please insert customer's name: ");
        String name = scanner.nextLine();
        System.out.println("Please insert invoice date: ");
        String date = scanner.nextLine();
        LocalDate invoiceDate = LocalDate.parse(date);
        System.out.println("Please insert customer type: household, business, production: ");
        String customerType = scanner.nextLine();
        System.out.println("Please insert the quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
//        Customer c = new Customer(customerID, name, invoiceDate, quantity, totalAmount);
        VietnameseCustomer c = new VietnameseCustomer(customerID, name, invoiceDate, quantity, customerType);
        VietnamI.add(c);
    }

    public void showCustomer() {
        for (VietnameseCustomer v : VietnamI) {
            System.out.println(v.customerID + " - " + v.name + " - " + v.invoiceDate + " - " + v.customerType + " - " + v.quantity + " - " + v.totalAmount);
        }
        return;
    }

    public int countVietnameseCustomer() {
        int n = VietnamI.size();
        for (int i = 0; i < VietnamI.size(); i++) {
            for (int j = i + 1; j < (VietnamI.size() - 1); j++) {
                if (VietnamI.get(i).customerID == VietnamI.get(j).customerID) {
                    n = n - 1;
                }
            }
        }
        return n;
    }


    public void exportInvoice() {

        for (VietnameseCustomer v : VietnamI) {
            if (v.invoiceDate.compareTo(LocalDate.parse("2019-01-01")) >= 0 && v.invoiceDate.compareTo(LocalDate.parse("2019-01-31")) <= 0) {
                System.out.println(v.customerID + " - " + v.name + " - " + v.invoiceDate + " - " + v.customerType + " - " + v.quantity + " - " + v.totalAmount);
            }
        }
        return;
    }
}
