package com.Spring.with.postman.Spring.with.postman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data//for setter and getters
@Table(name="Student_Details")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name="ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="St_marks")
    private int marks;
    @Column(name="st_name")
    private String name;

}
