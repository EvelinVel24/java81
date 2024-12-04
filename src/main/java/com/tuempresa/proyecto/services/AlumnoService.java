package src.main.java.com.tuempresa.proyecto.services;
import src.main.java.com.tuempresa.proyecto.models.Alumno;
import src.main.java.com.tuempresa.proyecto.repository.AlumnoRepository;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public List<Alumno> findAll() {
        return alumnoRepository.findAll();
    }
}
