package com.yhamdane.cachequickstart.service.impl;

import com.yhamdane.cachequickstart.domain.Student;
import com.yhamdane.cachequickstart.repository.StudentRepository;
import com.yhamdane.cachequickstart.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DefaultStudentService implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Cacheable("student")
    public Student getStudentById(Long id) {
        long startDate = new Date().getTime();
        Student student = studentRepository.getStudentById(id);
        long endDate = new Date().getTime();
        System.out.println("response time : " + (endDate - startDate)+"ms");
        return student;
    }
}
