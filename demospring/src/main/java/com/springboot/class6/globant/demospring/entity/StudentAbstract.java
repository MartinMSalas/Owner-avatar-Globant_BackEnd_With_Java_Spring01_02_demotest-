package com.springboot.class6.globant.demospring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // or InheritanceType.JOINED
public abstract  class StudentAbstract {
    @Id
    protected Long studentId;
    private String name;

    public abstract void run();
}
