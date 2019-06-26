package Main.SERVICE;

import Main.DAO.Sofkiano;
import Main.DTO.SofkianoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SofkianoService {


    @Autowired
    private SofkianoRepository repository;

    public List<Sofkiano> getAll() {
        return repository.findAll();
    }

    public Sofkiano save(Sofkiano sofkiano) {
        return repository.save(sofkiano);
    }


    public void delete(String id) {
        repository.deleteById(id);
    }

}
