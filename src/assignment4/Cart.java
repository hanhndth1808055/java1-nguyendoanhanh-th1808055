package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public int id;
    public String customer;
    public double grandTotal;
    public ArrayList<Product> productList;
    public String city;

    public Cart() {
        this.productList = new ArrayList<>();
    }

    public Cart(int id, String customer, String city) {
        this.id = id;
        this.customer = customer;
        this.city = city;
        this.productList = new ArrayList<>();
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please add product's name: ");
        String name = scanner.nextLine();
        System.out.println("Please add the quantity of the product: ");
        int qty = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please add the price of the product: ");
        double price = scanner.nextDouble();

        Product product = new Product(id, name, qty, price);
        this.productList.add(product);
    }

    public void removeProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert product ID to delete: ");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).id == id && productList.get(i).checkQty()) {
                productList.remove(i);
            }
        }
    }

    public double calculateGrandTotal() {
        double total = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).checkQty()) {
                System.out.println("Sub-total of Item " + (i + 1) + ":" + productList.get(i).qty * productList.get(i).price);
                total += productList.get(i).qty * productList.get(i).price;
            }
        }
        if (this.city.equals("HN") || this.city.equals("HCM")) {
            this.grandTotal = total + 0.01 * total;
        } else {
            this.grandTotal = total + 0.02 * total;
        }
        System.out.println("The grand total is: " + this.grandTotal);
        return this.grandTotal;
    }
}
