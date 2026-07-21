import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setEmpId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        emp.setEmpName(sc.nextLine());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());

        emp.displayDetails();

        sc.close();
    }
}
------------------------------------------------------------------
  OUTPUT : 
Enter Employee ID: 101
Enter Employee Name: Vanshika
Enter Salary: 35000

------ Employee Details ------
Employee ID   : 101
Employee Name : Vanshika
Salary        : 35000.0
