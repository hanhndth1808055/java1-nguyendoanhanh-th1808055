package assignment8;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class Customer {
    public int customerID;
    public String name;
    public LocalDate invoiceDate;
    public int quantity;
    public float totalAmount;

    public Customer(int customerID, String name, LocalDate invoiceDate, int quantity) {
        this.customerID = customerID;
        this.name = name;
        this.invoiceDate = invoiceDate;
        this.quantity = quantity;
    }

    public Customer() {
    }
}
