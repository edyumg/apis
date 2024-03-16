package com.example.crud.controller;

import com.example.crud.entity.Student;
import com.example.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


//Controlador para la entidad estudiante
@RestController
@RequestMapping(path= "api/v1/students")
public class StudentController {
    // Inyección de dependencias para el servicio de estudiante
    @Autowired
    private  StudentService studentService;

    //Método para obtener todos los estudiantes
    @GetMapping
    public List<Student> getAll(){
        //Llamada al método del servicio
        return studentService.getStudents();
    }
    //Método para obtener un estudiante por id
    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("studentId") Long studentId){
        //Llamada al método del servicio para obtener un estudiante por id
        return studentService.getStudent(studentId);
    }

    //Método para guardar o actualizar un estudiante
    @PostMapping
    public void saveUpdate(@RequestBody Student student){
         studentService.saveOrUpdate(student);
    }
    //Método para eliminar un estudiante
    @DeleteMapping("/{studentId}")
    //Se recibe el id del estudiante a eliminar
    public void saveUpdate(@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }
}
