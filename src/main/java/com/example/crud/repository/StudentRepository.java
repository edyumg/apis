package com.example.crud.repository;

import com.example.crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// Repositorio para la entidad estudiante
@Repository
public interface StudentRepository  extends JpaRepository<Student,Long> {
}
