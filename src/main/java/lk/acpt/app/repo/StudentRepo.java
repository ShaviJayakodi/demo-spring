package lk.acpt.app.repo;

import lk.acpt.app.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Integer> {
}
