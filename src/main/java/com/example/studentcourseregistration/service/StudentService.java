
package com.example.studentcourseregistration.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentcourseregistration.model.Student;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();
    private long nextId = 1;

    public Student registerStudent(Student student) {
        student.setStudentId(nextId++);
        students.add(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Student getStudentById(Long id) {
        return students.stream()
                .filter(student -> student.getStudentId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteStudent(Long id) {
        return students.removeIf(
                student -> student.getStudentId().equals(id));
    }
}
