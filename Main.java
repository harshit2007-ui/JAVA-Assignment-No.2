import java.util.*;

public class Main {

    interface Payment {
        void makePayment(double amount);
        void details();
    }

    static class CreditCard implements Payment {
        public void makePayment(double amount) {
            System.out.println("Credit Card Payment: Rs." + amount);
        }

        public void details() {
            System.out.println("Payment Mode: Credit Card");
        }
    }

    static class UPI implements Payment {
        public void makePayment(double amount) {
            System.out.println("UPI Payment: Rs." + amount);
        }

        public void details() {
            System.out.println("Payment Mode: UPI");
        }
    }

    static class Cash implements Payment {
        public void makePayment(double amount) {
            System.out.println("Cash Payment: Rs." + amount);
        }

        public void details() {
            System.out.println("Payment Mode: Cash");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash");
        System.out.print("Enter choice: ");

        int ch = sc.nextInt();

        Payment p;

        if (ch == 1)
            p = new CreditCard();
        else if (ch == 2)
            p = new UPI();
        else if (ch == 3)
            p = new Cash();
        else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        p.makePayment(amount);
        p.details();
    }
}