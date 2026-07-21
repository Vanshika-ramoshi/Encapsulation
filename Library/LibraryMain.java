import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library lib = new Library();

        System.out.print("Enter Book Name: ");
        lib.setBookName(sc.nextLine());

        System.out.println("\n1. Issue Book");
        System.out.println("2. Return Book");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                lib.issueBook();
                break;

            case 2:
                lib.returnBook();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        lib.displayDetails();

        sc.close();
    }
}
-----------------------------------------------------------------------------------------------
  OUTPUT :
Enter Book Name: Java Programming

1. Issue Book
2. Return Book
Enter Choice: 1

Book Issued Successfully.

------ Library Details ------
Book Name        : Java Programming
Book Available   : false
