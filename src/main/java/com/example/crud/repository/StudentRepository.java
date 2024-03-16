package com.example.crud.repository;

import com.example.crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Extiende de los metodos JpaRepository para poder ser utilizados desde nuestro servicio.
@Repository
public interface StudentRepository  extends JpaRepository<Student,Long> {
}
