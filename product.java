public abstract class Product implements IDiscountable {
    private String name;
    private double price;
    private static int counter=0;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        counter++;
    }

    public Product(String name) {
        this.name = name;
        this.price = 0.0;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void displayProductCount() {
        System.out.println("Number of products created: " + counter);
    }

    public double applyDiscount(double discountPercentage) {
        return this.price * (1 - discountPercentage);
    }

    public void displayInfo() {
        System.out.println("Product Name: " + name + ", Price: $" + price);
    }
}