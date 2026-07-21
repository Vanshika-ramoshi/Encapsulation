import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel h = new Hotel();

        System.out.print("Enter Room Number: ");
        h.setRoomNumber(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        h.setCustomerName(sc.nextLine());

        System.out.println("\n1. Book Room");
        System.out.println("2. Cancel Room");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            h.bookRoom();
        } else if (choice == 2) {
            h.cancelRoom();
        } else {
            System.out.println("Invalid Choice");
        }

        h.displayDetails();

        sc.close();
    }
}
-------------------------------------------------------------------------------------------------------
Output : 
Enter Room Number: 101
Enter Customer Name: Vanshika

1. Book Room
2. Cancel Room
Enter Choice: 1

Room Booked Successfully.

--------- Hotel Room Details ---------
Room Number    : 101
Customer Name  : Vanshika
Booking Status : true
