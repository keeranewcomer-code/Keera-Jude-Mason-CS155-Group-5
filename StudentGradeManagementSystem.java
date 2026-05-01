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
        if (count == 0) {
            System.out.println("There are no students to display. Please add a student first.");
            return;
        }

        System.out.println("List of Students and Grades: ");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }
    }

    public void findStudent() {
        if (count == 0) {
            System.out.println("There are no students to search. Please add a student first.");
            return;
        }

        System.out.print("Enter student name: ");
        String searchForName = input.nextLine();
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(searchForName)) {
                System.out.println(names[i] + "'s Grade: " + grades[i]);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void calculateAverage() {
        if (count == 0) {
            System.out.println("There are no grades to calculate. Please add a student first.");
            return;
        }

        int total = 0

        for (int i = 0; i < count; i++) {
            total = total + grades[i];
        }

        double average = (double) total / count;

        System.out.println("Class Average: " + average);
    }

    public void findHighestAndLowest() {
        if (count == 0) {
            System.out.println("There are no grades to search. Please add a student first.");
            return;
        }

        int highestGrade = 0;
        int lowestGrade = 0;

        for (int i = 0; i < count; i++) {
            if (grades[i] > grades[highestGrade]) {
                highestGrade = i;
            }

            if (grades[i] < grades[lowestGrade]) {
                lowestGrade = i;
            }
        }

        System.out.println("Highest Grade: " + names[highestGrade] + " - " + grades[highestIndex]);
        System.out.println("Lowest Grade: " + names[lowestGrade] + " - " + grades[lowestGrade]);
    }
}
