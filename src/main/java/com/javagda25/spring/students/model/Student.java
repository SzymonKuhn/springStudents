package com.javagda25.spring.students.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity //to jest encja bazodanowa
public class Student   {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String surname;

    private boolean alive;
    private int age;

//    @Formula(value = "(select avg(g.value) from grade g where g.student_id = id)")
//    private Double average;
//
//    @ToString.Exclude
//    @OneToMany (mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
//    @Cascade(value = {org.hibernate.annotations.CascadeType.REMOVE})
//    private List<Grade> grades;

    public Student(String name, String surname, int age, boolean alive) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.alive = alive;
    }

    public Student(Long id, String name, String surname, int age, boolean alive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.alive = alive;
    }




}
