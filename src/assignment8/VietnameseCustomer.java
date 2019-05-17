package assignment8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class VietnameseCustomer extends Customer {
    public ArrayList<Customer> CustomerList = new ArrayList<>();
    public String customerType;
    static ArrayList<PriceSet> PriceSetVietnamese = new ArrayList<>();
    PriceSet s1 = new PriceSet();
    PriceSet s2 = new PriceSet();
    PriceSet s3 = new PriceSet();
    PriceSet s4 = new PriceSet();

    public VietnameseCustomer(int customerID, String name, LocalDate invoiceDate, int quantity, String customerType) {
        super(customerID, name, invoiceDate, quantity);
        this.customerType = customerType;
        this.s1.quantity = 50;
        this.s1.price = 1000;
        this.s2.quantity = 100;
        this.s2.price = 1200;
        this.s3.quantity = 200;
        this.s3.price = 1500;
        this.s4.quantity = 201;
        this.s4.price = 2000;
        PriceSetVietnamese.add(s1);
        PriceSetVietnamese.add(s2);
        PriceSetVietnamese.add(s3);
        if (quantity <= s1.quantity) {
        this.totalAmount = quantity * s1.price;
        } else if (quantity <= s2.quantity) {
            this.totalAmount = 50 * 1000 + (quantity - 50) * 1200;
        } else if (quantity <= s3.quantity) {
            this.totalAmount = 50 * 1000 + 50 * 1200 + (quantity - 100) * 1500;
        } else {
            this.totalAmount = 50 * 1000 + 50 * 1200 + 100 * 1500 + (quantity - 200) * 2000;
        }
    }

    public VietnameseCustomer() {
    }
}