import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount() {
        accountNumber = 0;
        accountHolderName = "Unknown";
        balance = 0;
    }

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount a1 = new BankAccount();

        System.out.println("Default Account:");
        a1.displayAccount();

        System.out.print("\nEnter Account Number: ");
        int no = sc.nextInt();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.next();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        BankAccount a2 = new BankAccount(no, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        a2.deposit(deposit);

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();
        a2.withdraw(withdraw);

        System.out.println("\n--- Account Details ---");
        a2.displayAccount();
    }
}