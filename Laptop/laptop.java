public class Laptop {

    private String brand;
    private String model;
    private int ram;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // Display Method
    public void displayDetails() {

        System.out.println("\n--------- Laptop Details ---------");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("RAM   : " + ram + " GB");
        System.out.println("Price : ₹" + price);
    }
}
