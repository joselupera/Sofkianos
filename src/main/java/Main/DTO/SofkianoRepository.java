package Main.DTO;


import Main.DAO.Sofkiano;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SofkianoRepository extends MongoRepository<Sofkiano, String> {



}