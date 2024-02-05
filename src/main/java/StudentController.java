import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student>list(){
        return service.listAll();
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id){
        try {
            Student student = service.get(id);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/students")
    public void add(@RequestBody Student student){
        service.create(student);
    }
    @PostMapping("/students/{id}")
    public ResponseEntity<?> update(@RequestBody Student student, @PathVariable Integer id){
        try {
            Student studentExist = service.get(id);
            service.create(student);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
