public class Amazon {

  
    private String productName;
    private double price;
    private int stock;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void buyProduct(int quantity) {

        if (stock == 0) {
            System.out.println("Product is Out of Stock.");
        }
        else if (quantity > stock) {
            System.out.println("Only " + stock + " item(s) available.");
        }
        else {
            stock = stock - quantity;

            System.out.println("Product Purchased Successfully.");
            System.out.println("Total Amount = " + (quantity * price));
            System.out.println("Remaining Stock = " + stock);
        }
    }

    public void displayDetails() {

        System.out.println("\n------ Product Details ------");
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Stock        : " + stock);
    }
}
