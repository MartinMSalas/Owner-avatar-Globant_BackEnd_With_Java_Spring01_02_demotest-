package com.springboot.class6.globant.demospring.service;

import com.springboot.class6.globant.demospring.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStudentServiceImpl implements IStudentService {
    private final IStudentRepository studentRepository;


    @Autowired
    public IStudentServiceImpl(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public List<String> getAllStudents() {
        List<String> students = List.of("Juan", "Pedro", "Maria", "Jose");
        return students;
    }
}
