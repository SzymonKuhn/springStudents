package com.javagda25.spring.students.repository;

import com.javagda25.spring.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //nieobligatoryjne, nie trzeba bo JpaRepository jest komponenetem
public interface StudentRepository extends JpaRepository <Student, Long> {
}
