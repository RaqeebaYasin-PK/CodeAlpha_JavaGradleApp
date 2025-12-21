package com.example.sms.main;

import com.example.sms.model.Student;
import com.example.sms.service.StudentService;
import com.example.sms.util.InputUtil;

import java.util.List;
import java.util.Optional;

/**
 * Application entry point providing a menu-driven console interface.
 * Separates UI concerns from business logic by delegating to StudentService.
 */
public class Main {
    private final StudentService service = new StudentService();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        while (true) {
            printMenu();
            int choice = InputUtil.readInt("Select an option: ", 1, 6);
            switch (choice) {
                case 1 -> addStudent();      // Create
                case 2 -> viewAllStudents(); // Read
                case 3 -> searchStudentById();
                case 4 -> updateStudent();   // Update
                case 5 -> deleteStudent();   // Delete
                case 6 -> { System.out.println("Goodbye."); 
                return; }
                default -> System.out.println("Unknown option.");
            }
            System.out.println();
        }
    }

    private void printMenu() {
        System.out.println("============================");
        System.out.println(" Student Management System ");
        System.out.println("============================");
        System.out.println("1) Add student");
        System.out.println("2) View all students");
        System.out.println("3) Search student by ID");
        System.out.println("4) Update student details");
        System.out.println("5) Delete student");
        System.out.println("6) Exit");
    }

    /**
     * Handles creation of a new student after validated input.
     */
    private void addStudent() {
        int id = InputUtil.readInt("Enter ID (1-1000000): ", 1, 1_000_000);
        if (service.findById(id).isPresent()) {
            System.out.println("A student with this ID already exists.");
            return;
        }
        String name = InputUtil.readNonEmptyString("Enter name: ");
        int age = InputUtil.readInt("Enter age (5-120): ", 5, 120);
        String email = InputUtil.readEmail("Enter email: ");

        boolean ok = service.addStudent(new Student(id, name, age, email));
        System.out.println(ok ? "Student added." : "Failed to add student.");
    }

    /**
     * Displays all students or a friendly message when empty.
     */
    private void viewAllStudents() {
        List<Student> all = service.getAllStudents();
        if (all.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : all) {
            System.out.println(s);
        }
    }

    /**
     * Looks up a student by ID and prints the result.
     */
    private void searchStudentById() {
        int id = InputUtil.readInt("Enter ID: ", 1, 1_000_000);
        Optional<Student> opt = service.findById(id);
        System.out.println(opt.map(Object::toString).orElse("Student not found."));
    }

    /**
     * Updates an existing student's details after validation.
     */
    private void updateStudent() {
        int id = InputUtil.readInt("Enter ID to update: ", 1, 1_000_000);
        Optional<Student> opt = service.findById(id);
        if (opt.isEmpty()) {
            System.out.println("Student not found.");
            return;
        }
        String name = InputUtil.readNonEmptyString("Enter new name: ");
        int age = InputUtil.readInt("Enter new age (5-120): ", 5, 120);
        String email = InputUtil.readEmail("Enter new email: ");
        boolean ok = service.updateStudent(id, name, age, email);
        System.out.println(ok ? "Student updated." : "Failed to update student.");
    }

    /**
     * Deletes a student by ID with a success/failure message.
     */
    private void deleteStudent() {
        int id = InputUtil.readInt("Enter ID to delete: ", 1, 1_000_000);
        boolean ok = service.deleteStudent(id);
        System.out.println(ok ? "Student deleted." : "Student not found.");
    }
}
