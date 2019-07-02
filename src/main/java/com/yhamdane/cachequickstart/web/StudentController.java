package com.yhamdane.cachequickstart.web;

import com.yhamdane.cachequickstart.domain.Student;
import com.yhamdane.cachequickstart.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;
   @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
       System.out.println("Returned student id : "+id);
        return new ResponseEntity(studentService.getStudentById(id), HttpStatus.OK);
    }
}
