package assignment4;

public class Product {
    public int id;
    public String productName;
    public int qty;
    public double price;

    public Product() {
    }

    public Product(int id, String productName, int qty, double price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public boolean checkQty() {
        if (qty > 0) {
            System.out.println("The stock is available.");
            return true;
        } else {
            System.out.println("Product is out of stock.");
            return false;
        }
    }
}
