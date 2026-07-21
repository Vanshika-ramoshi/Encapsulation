import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Login l = new Login();

        System.out.print("Enter Email: ");
        l.setEmail(sc.nextLine());

        System.out.print("Enter Password: ");
        l.setPassword(sc.nextLine());

        System.out.println();

        if (!l.validateEmail()) {
            System.out.println("Invalid Email");
        }

        if (!l.validatePassword()) {
            System.out.println("Password must contain at least 8 characters");
        }

        l.login();

        sc.close();
    }
}
---------------------------------------------------------------------------------
Enter Email: vanshika@gmail.com
Enter Password: abc12345

Login Successful
