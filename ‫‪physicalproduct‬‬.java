class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(String name, double price, double weight) {
        super(name,price);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName() +", Price: $" + getPrice() +", Weight: " +weight + " kg");
    }
    public double getWeight(){
        return weight;
    }
}