class DigitalProduct extends Product {
    private double fileSize;

    public DigitalProduct(String name, double price, double fileSize) {
        super(name,price);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName() +", Price: $" + getPrice() +", File Size: " + fileSize + " GB");
    }
}