package com.example.SpringSecurity.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.SpringSecurity.Model.Student;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Long> {

}
