import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRespository repo;

    public void create(Student student){
        repo.save(student);
    }

    public  Student get(Integer id){
        return repo.findById(id).get();
    }

    public List<Student> listAll(){
        return repo.findAll();
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }

}
