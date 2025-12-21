package com.example.sms.service;

import com.example.sms.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Service layer for managing students in-memory using {@link ArrayList}.
 * Provides basic CRUD operations and enforces unique IDs.
 */
public class StudentService {
    private final List<Student> students = new ArrayList<>();

    /**
     * Adds a student if the ID is not already present.
     * @return true when added; false if duplicate ID
     */
    public boolean addStudent(Student student) {
        if (findById(student.getId()).isPresent()) {
            return false;
        }
        students.add(student);
        return true;
    }

    /**
     * Returns an unmodifiable view of all students.
     */
    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(students);
    }

    /**
     * Finds a student by ID.
     */
    public Optional<Student> findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    /**
     * Updates a student's details by ID.
     * @return true if updated; false if not found
     */
    public boolean updateStudent(int id, String name, int age, String email) {
        Optional<Student> opt = findById(id);
        if (opt.isEmpty()) {
            return false;
        }
        Student s = opt.get();
        s.setName(name);
        s.setAge(age);
        s.setEmail(email);
        return true;
    }

    /**
     * Deletes a student by ID.
     * @return true if deleted; false if not found
     */
    public boolean deleteStudent(int id) {
        Optional<Student> opt = findById(id);
        if (opt.isEmpty()) {
            return false;
        }
        students.remove(opt.get());
        return true;
    }
}
