import java.util.Scanner;

public class StudentGradeManagementSystem {

    private Scanner input = new Scanner(System.in);

    private String[] names = new String[50];
    private int[] grades = new int[50];
    private int count = 0;
    public static void main(String[] args) {
        StudentGradeManagementSystem system = new StudentGradeManagementSystem();
        system.menuLoop();
    }

    public void menuLoop() {
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
                System.out.println("Invalid choice. Please select an option between 1 and 6.");
            }

            System.out.println();
        }
    }


    public void showMenu() {
        System.out.println("Welcome to Student Grade Management System");
        System.out.println("1. Add Student and Grade");
        System.out.println("2. Display All Students and Grades");
        System.out.println("3. Find a Student's Grade");
        System.out.println("4. Calculate Class Average");
        System.out.println("5. Find Highest and Lowest Grades");
        System.out.println("6. Exit the Program");
    }

    public void addStudent() {
        if (count >= 50) {
            System.out.println("Student list is at full capacity.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student grade: ");
        int grade = input.nextInt();
        input.nextLine();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid input! Grade must be between 0 and 100.");
            return;
        }

        names[count] = name;
        grades[count] = grade;
        count++;
        System.out.println("Student successfully added.");

    }

    public void displayStudents() {

    }

    public void findStudent() {

    }

    public void calculateAverage() {

    }

    public void findHighestAndLowest() {

    }
}