package com.yhamdane.cachequickstart.service.impl;

import com.yhamdane.cachequickstart.domain.Student;
import com.yhamdane.cachequickstart.repository.StudentRepository;
import com.yhamdane.cachequickstart.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DefaultStudentService implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Cacheable("student")
    public Student getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }
}
