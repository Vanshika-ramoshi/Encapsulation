import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Laptop l = new Laptop();

        System.out.print("Enter Brand: ");
        l.setBrand(sc.nextLine());

        System.out.print("Enter Model: ");
        l.setModel(sc.nextLine());

        System.out.print("Enter RAM (GB): ");
        l.setRam(sc.nextInt());

        System.out.print("Enter Price: ");
        l.setPrice(sc.nextDouble());

        l.displayDetails();

        sc.close();
    }
}
---------------------------------------------------------------------------------------------
  OUTPUT :
Enter Brand: Dell
Enter Model: Inspiron 15
Enter RAM (GB): 16
Enter Price: 65000

--------- Laptop Details ---------
Brand : Dell
Model : Inspiron 15
RAM   : 16 GB
Price : ₹65000.0
