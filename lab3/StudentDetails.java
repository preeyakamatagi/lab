import java.util.Scanner;

class StudentDetails {
    static final int MAX_STUDENTS = 1024;
    static String names[] = new String[MAX_STUDENTS];
    static String details[][] = new String[MAX_STUDENTS][5];
    static int count = 0;

    static void collectDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();

        int index = search(name);
        if (index != -1) {
            System.out.println("The details of the student " + name + " already exists.");
            return;
        }

        names[count] = name;
        System.out.print("Enter the register number of the student: ");
        details[count][0] = sc.nextLine();
        System.out.print("Enter the email of the student: ");
        details[count][1] = sc.nextLine();
        System.out.print("Enter the class of the student: ");
        details[count][2] = sc.nextLine();
        System.out.print("Enter the department of the student: ");
        details[count][3] = sc.nextLine();

        count++;
    }

    static int search(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    static void displayDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();

        int index = search(name);
        if (index == -1) {
            System.out.println("The details of the student " + name + " doesn't exist.");
            return;
        }

        System.out.println("Name: " + names[index]);
        System.out.println("Register Number: " + details[index][0]);
        System.out.println("Email: " + details[index][1]);
        System.out.println("Class: " + details[index][2]);
        System.out.println("Department: " + details[index][3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Collect Details");
            System.out.println("2. Display Details");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    collectDetails();
                    break;
                case 2:
                    displayDetails();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}