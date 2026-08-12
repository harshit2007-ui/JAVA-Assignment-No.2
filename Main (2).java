import java.util.Scanner;

public class Main {

    static class BankAccount {
        int accountNumber;
        String name;
        double balance;

        BankAccount() {
            accountNumber = 0;
            name = "Unknown";
            balance = 0;
        }

        BankAccount(int no, String n, double b) {
            accountNumber = no;
            name = n;
            balance = b;
        }

        void deposit(double amount) {
            balance += amount;
        }

        void withdraw(double amount) {
            if (amount <= balance)
                balance -= amount;
            else
                System.out.println("Insufficient Balance");
        }

        void display() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + name);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount a1 = new BankAccount();

        System.out.println("Default Account:");
        a1.display();

        System.out.print("\nEnter Account Number: ");
        int no = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        BankAccount a2 = new BankAccount(no, name, balance);

        System.out.print("Enter Deposit: ");
        a2.deposit(sc.nextDouble());

        System.out.print("Enter Withdraw: ");
        a2.withdraw(sc.nextDouble());

        System.out.println("\nAccount Details:");
        a2.display();
    }
}