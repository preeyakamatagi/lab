import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    // global variables
    private static int accountNumber;
    private static String accountHolderName;
    private static double accountBalance;

    // transaction history
    private static ArrayList<String> transactions = new ArrayList<String>();

    // initialize the customer
    public static void initializeCustomer(int accNo, String accHolderName, double accBalance) {
        accountNumber = accNo;
        accountHolderName = accHolderName;
        accountBalance = accBalance;
        transactions.add("Account created with initial balance: " + accountBalance);
        System.out.println("Customer initialized!");
    }

    // deposit money
    public static void deposit(double amount) {
        accountBalance += amount;
        transactions.add("Deposited: " + amount);
        System.out.println("Deposit successful!");
    }

    // withdraw money
    public static void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient balance!");
            return;
        }
        accountBalance -= amount;
        transactions.add("Withdrawn: " + amount);
        System.out.println("Withdrawal successful!");
    }

    // print the transactions
    public static void printTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found!");
            return;
        }
        System.out.println("Transaction history:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // print account summary
    public static void printAccountSummary() {
        System.out.println("Account summary:");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize customer
        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();
        System.out.print("Enter account holder name: ");
        String accHolderName = scanner.next();
        System.out.print("Enter account balance: ");
        double accBalance = scanner.nextDouble();
        initializeCustomer(accNo, accHolderName, accBalance);

        // menu
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    withdraw(withdrawalAmount);
                    break;
                case 3:
                    printTransactions();
                    break;
                case 4:
                    printAccountSummary();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
