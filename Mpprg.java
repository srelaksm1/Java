import java.util.Scanner;

class Student {
    String name;
    int rollno;
    String section;

    // Constructor to initialize student details
    Student(String name, int rollno, String section) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student details:");
        System.out.println("Name: " + this.name + ", Roll No: " + this.rollno + ", Section: " + this.section);
    }
}

class Mpprg {
    public static void main(String args[]) {
        Student student[] = new Student[3];
        Scanner scanner = new Scanner(System.in); // Instantiate Scanner object to read input
        
        // Loop to get details of 3 students
        for (int i = 0; i < 3; i++) {
            // Get input from user
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();  // Read student name

            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            int rollno = scanner.nextInt();    // Read student roll number

            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Enter section for student " + (i + 1) + ": ");
            String section = scanner.nextLine();  // Read student section

            // Create a new student object with the input details
            student[i] = new Student(name, rollno, section);
        }
        
        // Print details of each student
        System.out.println("\nStudent Details:");
        for (int i = 0; i < 3; i++) {
            student[i].printDetails();
        }

        scanner.close();  // Close the scanner to prevent memory leaks
    }
}

