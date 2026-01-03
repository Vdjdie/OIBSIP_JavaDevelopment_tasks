import java.util.Scanner;
import java.util.ArrayList;

public class ATMInterface {

    static double balance = 10000;
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userId = "dipika";
        int pin = 1234;

        System.out.print("Enter User ID: ");
        String uid = sc.nextLine();

        System.out.print("Enter PIN: ");
        int upin = sc.nextInt();

        if (!uid.equals(userId) || upin != pin) {
            System.out.println("Invalid Login");
            
        }

        int choice;
        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Transaction History:");
                    for (String h : history) {
                        System.out.println(h);
                    }
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    if (w <= balance) {
                        balance -= w;
                        history.add("Withdraw: " + w);
                        System.out.println("Withdraw Successful");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    balance += d;
                    history.add("Deposit: " + d);
                    System.out.println("Deposit Successful");
                    break;

                case 4:
                    System.out.print("Enter amount: ");
                    double t = sc.nextDouble();
                    if (t <= balance) {
                        balance -= t;
                        history.add("Transfer: " + t);
                        System.out.println("Transfer Successful");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Current Balance: " + balance);

        } while (choice != 5);

        sc.close();
    }
}
