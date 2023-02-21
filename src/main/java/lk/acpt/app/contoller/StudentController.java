package lk.acpt.app.contoller;

import lk.acpt.app.model.Student;
import lk.acpt.app.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepo studentRepo;

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return (List<Student>) studentRepo.findAll();
    }
}
