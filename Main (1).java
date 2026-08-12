import java.util.Scanner;

public class Main {

    static abstract class Employee {
        int employeeId;
        String employeeName;
        double basicSalary;

        Employee(int id, String name, double salary) {
            employeeId = id;
            employeeName = name;
            basicSalary = salary;
        }

        abstract double calculateSalary();

        void display() {
            System.out.println("ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Salary: " + calculateSalary());
        }
    }

    static class PermanentEmployee extends Employee {

        PermanentEmployee(int id, String name, double salary) {
            super(id, name, salary);
        }

        double calculateSalary() {
            return basicSalary + 0.20 * basicSalary
                    + 0.40 * basicSalary - 0.12 * basicSalary;
        }
    }

    static class ContractEmployee extends Employee {

        ContractEmployee(int id, String name, double salary) {
            super(id, name, salary);
        }

        double calculateSalary() {
            return basicSalary + 0.10 * basicSalary;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee e;

        System.out.println("\nPermanent Employee:");
        e = new PermanentEmployee(id, name, salary);
        e.display();

        System.out.println("\nContract Employee:");
        e = new ContractEmployee(id, name, salary);
        e.display();
    }
}