package com.springboot.class6.globant.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.class6.globant.demospring.entity.Student;
@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {
}
