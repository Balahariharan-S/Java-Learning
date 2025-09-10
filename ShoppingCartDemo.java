public class ShoppingCartDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 80000.00, 1);
        Product p2 = new Product("Mouse", 250.50, 2);
        p1.displayProduct();
        p2.displayProduct();
    }
}
