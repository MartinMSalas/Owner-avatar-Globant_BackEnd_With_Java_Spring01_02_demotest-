package com.springboot.class6.globant.demospring.controller;

import com.springboot.class6.globant.demospring.entity.Student;
import com.springboot.class6.globant.demospring.service.IStudentService;
import com.springboot.class6.globant.demospring.service.IStudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    private final IStudentService studentService;

    @Autowired
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();

        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }
    /*
    @PostMapping
    public ResponseEntity<String> createStudent() {
        return new ResponseEntity<>("Vamos Equipo 15", HttpStatus.OK);
    }
    */

}
