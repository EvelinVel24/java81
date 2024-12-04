package src.main.java.com.tuempresa.proyecto.controllers;
import src.main.java.com.tuempresa.proyecto.models.Materia;
import src.main.java.com.tuempresa.proyecto.services.MateriaService;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @PostMapping
    public Materia save(@RequestBody Materia materia) {
        return materiaService.save(materia);
    }
}
