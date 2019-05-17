package assignment8;

import java.time.LocalDate;
import java.util.ArrayList;

public class ForeignCustomer extends Customer {
public String nationality;
public float price = 2000;

    public ArrayList<Customer> CustomerList = new ArrayList<>();
    public String customerType;

    public ForeignCustomer(int customerID, String name, LocalDate invoiceDate, int quantity, String nationality) {
        super(customerID, name, invoiceDate, quantity);
        this.nationality = nationality;
        this.totalAmount = quantity*price;
    }

    public ForeignCustomer() {
    }
}
