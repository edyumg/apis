package com.example.crud.service;

import com.example.crud.entity.Student;
import com.example.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Servicio para la entidad estudiante
@Service
public class StudentService {
    // Inyección de dependencias para el repositorio de estudiante
    @Autowired
    StudentRepository studentRepository;
    //Método para obtener todos los estudiantes
    public List<Student> getStudents(){

        return studentRepository.findAll();
    }
    //Método para obtener un estudiante por id
    public Optional<Student> getStudent(Long id){

        return studentRepository.findById(id);
    }
    //Método para guardar o actualizar un estudiante
    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }
    //Método para eliminar un estudiante
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}

