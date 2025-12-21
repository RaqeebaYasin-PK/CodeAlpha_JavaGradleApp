package com.example.sms.service;

import com.example.sms.model.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void addFindUpdateDeleteFlow() {
        StudentService service = new StudentService();

        Student s1 = new Student(1, "Alice", 20, "alice@example.com");
        assertTrue(service.addStudent(s1));

        // duplicate ID should be rejected
        assertFalse(service.addStudent(new Student(1, "Bob", 22, "bob@example.com")));

        List<Student> all = service.getAllStudents();
        assertEquals(1, all.size());

        assertTrue(service.findById(1).isPresent());

        assertTrue(service.updateStudent(1, "Alice B", 21, "aliceb@example.com"));
        assertEquals("Alice B", service.findById(1).get().getName());

        assertTrue(service.deleteStudent(1));
        assertFalse(service.findById(1).isPresent());
    }
}
package com.example.sms.service;

import com.example.sms.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void addAndFindById() {
        StudentService service = new StudentService();
        boolean added = service.addStudent(new Student(1, "Alice", 20, "alice@example.com"));
        assertTrue(added);
        assertTrue(service.findById(1).isPresent());
    }

    @Test
    void preventDuplicateIds() {
        StudentService service = new StudentService();
        assertTrue(service.addStudent(new Student(1, "Alice", 20, "alice@example.com")));
        assertFalse(service.addStudent(new Student(1, "Bob", 22, "bob@example.com")));
    }

    @Test
    void updateExistingStudent() {
        StudentService service = new StudentService();
        service.addStudent(new Student(2, "Bob", 19, "bob@example.com"));
        boolean updated = service.updateStudent(2, "Bob Jr", 20, "bob.jr@example.com");
        assertTrue(updated);
        Student s = service.findById(2).orElseThrow();
        assertEquals("Bob Jr", s.getName());
        assertEquals(20, s.getAge());
        assertEquals("bob.jr@example.com", s.getEmail());
    }

    @Test
    void deleteStudent() {
        StudentService service = new StudentService();
        service.addStudent(new Student(3, "Carol", 21, "carol@example.com"));
        assertTrue(service.deleteStudent(3));
        assertTrue(service.findById(3).isEmpty());
    }
}
