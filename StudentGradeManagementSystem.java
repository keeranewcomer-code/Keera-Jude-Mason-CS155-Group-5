import java.util.Scanner;

public class StudentGradeManagementSystem {

    Scanner input = new Scanner(System.in)

    String[] names = new String[50];
    int[] grades = new int[50];
    int count = 0
    public static void main(String[] args) {
        int choice = 0;

        while (choice != 6) {
            showMenu();

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            
            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                displayStudents();
            } else if (choice == 3) {
                findStudent();
            } else if (choice == 4) {
                calculateAverage();
            } else if (choice == 5) {
                findHighestAndLowest();
            } else if (choice == 6) {
                System.out.println("Exiting the program...");
            } else {
                System.out.println("Invalid choice. Please select an option between 1 and 6.")
            }

            System.out.println();
        }

    }

    public static void showMenu() {
        System.out.println("Welcome to Student Grade Management System");
        System.out.println("1. Add Student and Grade");
        System.out.println("2. Display All Students and Grades");
        System.out.println("3. Find a Student's Grade");
        System.out.println("4. Calculate Class Average");
        System.out.println("5. Find Highest and Lowest Grades");
        System.out.println("6. Exit the Program");
    }

    public static void addStudent() {

    }

    public static void displayStudents() {

    }

    public static void findStudent() {

    }

    public static void calculateAverage() {

    }

    public static void findHighestAndLowest() {

    }
}