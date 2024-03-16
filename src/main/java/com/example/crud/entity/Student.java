package com.example.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

//Contiene la entidad
@Data
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String LastName;
    @Column(name="email_address", unique = true)
    private String email;
}
