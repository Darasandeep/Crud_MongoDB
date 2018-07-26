package springbootmongodbrestapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import springbootmongodbrestapi.models.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    
}
