import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Amazon a = new Amazon();

        System.out.print("Enter Product Name: ");
        a.setProductName(sc.nextLine());

        System.out.print("Enter Product Price: ");
        a.setPrice(sc.nextDouble());

        System.out.print("Enter Stock: ");
        a.setStock(sc.nextInt());

        System.out.print("Enter Quantity to Buy: ");
        int quantity = sc.nextInt();

        a.buyProduct(quantity);

        a.displayDetails();

        sc.close();
    }
}
----------------------------------------------------------------------------------------------
  OUTPUT :
Enter Product Name: Laptop
Enter Product Price: 50000
Enter Stock: 5
Enter Quantity to Buy: 2

Product Purchased Successfully.
Total Amount = 100000.0
Remaining Stock = 3

------ Product Details ------
Product Name : Laptop
Price        : 50000.0
Stock        : 3
