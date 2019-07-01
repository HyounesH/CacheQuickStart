package com.yhamdane.cachequickstart.repository;

import com.yhamdane.cachequickstart.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student getStudentById(Long id);
}
