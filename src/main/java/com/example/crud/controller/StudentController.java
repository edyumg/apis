package com.example.crud.controller;

import com.example.crud.entity.Student;
import com.example.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "api/v1/students") //Se agrega la ruta para acceder a los datos
public class StudentController {

    @Autowired //Inyección de dependencias
    private  StudentService studentService;

    @GetMapping//microservicio para obtener todos los estudiantes

    public List<Student> getAll(){

        return studentService.getStudents();
    }
    @GetMapping("/{studentId}") //microservicio para obtener un estudiante por id
    public Optional<Student> getBId(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
    }

    @PostMapping //microservicio para guardar un estudiante
    public void saveUpdate(@RequestBody Student student){

         studentService.saveOrUpdate(student);
    }
    @DeleteMapping("/{studentId}") //microservicio para eliminar un estudiante por id
    public void saveUpdate(@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }
}
