package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public Optional<Student> getStudent(Integer id){
        return studentService.getStudent(id);
    }
    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/save")
    public void save(Student student){
         studentService.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(Integer id){
     studentService.delete(id);
    }
}
