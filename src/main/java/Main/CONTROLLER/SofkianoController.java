package Main.CONTROLLER;


import Main.DAO.Sofkiano;
import Main.SERVICE.SofkianoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "sofkiano")
public class SofkianoController {

    @Autowired
    private SofkianoService sofkianoService;

    @GetMapping
    public Iterable getAll() {
        return sofkianoService.getAll();
    }

    @PostMapping
    public Sofkiano save(@RequestBody Sofkiano sofkiano) {
        return sofkianoService.save(sofkiano);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id) {
        sofkianoService.delete(id);
    }
}
