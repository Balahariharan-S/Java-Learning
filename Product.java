class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double GetTotalPrice(){
        return price*quantity;
    }
    public void displayProduct(){
        System.out.println("ProductName: "+name+" Price: "+price+" QTY: "+quantity+" TotalPrice: "+GetTotalPrice());
    }
}
