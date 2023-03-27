
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int numStudents = 0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Update the details of a student");
            System.out.println("4. Display all students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    saveStudents();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void saveStudents() {
    }

    private static void displayAllStudents() {
    }

    private static void updateStudent(Scanner scanner) {
    }

    private static void addStudent(Scanner scanner) {
        if (numStudents >= MAX_STUDENTS) {
            System.out.println("Maximum number of students reached.");
            return;
        }

        System.out.print("Enter reg. no.: ");
        int regNo = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter class: ");
        String className = scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        Student student = new Student(regNo, name, email, phone, className, department);
        students[numStudents] = student;
        numStudents++;

        System.out.println("Student added successfully.");
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter name or reg. no.");
    }
}

class Student {
    private int regNo;
    private String name;
    private String email;
    private String phone;
    private String className;
    private String department;

    public Student(int regNo, String name, String email, String phone, String className, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.className = className;
        this.department = department;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getClassName() {
        return className;
    }

    public String getDepartment() {
        return department;
    }

    public void printDetails() {
        System.out.println("Reg. No.: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + className);
        System.out.println("Department: " + department);
    }

    public String toString() {
        return regNo + "," + name + "," + email + "," + phone + "," + className + "," + department;
    }
}