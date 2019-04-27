package assignment4;

public class Main{
    public static void main(String args[]){
        Cart cart = new Cart(1, "Nguyen Van A", "HN");
        cart.addProduct();
        cart.addProduct();
        cart.addProduct();
        cart.calculateGrandTotal();
        cart.removeProduct();
        cart.calculateGrandTotal();
    }
}
