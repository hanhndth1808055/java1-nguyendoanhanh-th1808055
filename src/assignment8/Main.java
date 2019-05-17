package assignment8;

public class Main {
    public static void main(String args[]) {
        Invoice i = new Invoice();
        i.insertCustomer();
        i.insertCustomer();
        i.insertCustomer();
        i.showCustomer();
        System.out.println("The number of Vietnamese Customers: " + i.countVietnameseCustomer());
        FInvoice f = new FInvoice();
        f.insertCustomer();
        f.insertCustomer();
        f.insertCustomer();
        f.showCustomer();
        System.out.println("The number of Foreign Customers: " + f.countForeignCustomer());
        System.out.println("The average amount for Foreigners: " + f.averageAmountForeignCustomer());
        System.out.println("---Invoices in 2019 January---");
        i.exportInvoice();
        f.exportInvoice();
    }
}
