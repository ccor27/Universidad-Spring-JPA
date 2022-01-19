package service;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Optional<Student> getStudent(Integer id){
        return studentRepository.findById(id);
    }
    public List<Student> getAllStudents(){
            return  studentRepository.findAll();
    }

    public void save(Student student){
       studentRepository.save(student);
    }

    public void delete(Integer id){
     boolean exist = studentRepository.existsById(id);
     if(!exist){
         throw new IllegalStateException("The student "+id+" no exist");
     }
        studentRepository.deleteById(id);
    }
}
