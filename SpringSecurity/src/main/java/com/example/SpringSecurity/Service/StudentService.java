package com.example.SpringSecurity.Service;

import java.util.List;
import com.example.SpringSecurity.Model.Student;

public interface StudentService {
    List<Student> getAllStudentList();           // Method to retrieve all students
    Student saveStudent(Student student);        // Method to save a new student
    Student getStudent(long id);                 // Method to retrieve a student by ID
    void deleteStudent(long studentId);          // Method to delete a student by ID
    Student updateStudent(Student student, long id); // Method to update a student by ID
}
