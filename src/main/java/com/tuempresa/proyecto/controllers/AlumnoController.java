package src.main.java.com.tuempresa.proyecto.controllers;
import src.main.java.com.tuempresa.proyecto.models.Alumno;
import src.main.java.com.tuempresa.proyecto.services.AlumnoService;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> findAll() {
        return alumnoService.findAll();
    }

    @PostMapping
    public Alumno save(@RequestBody Alumno alumno) {
        return alumnoService.save(alumno);
    }
}
