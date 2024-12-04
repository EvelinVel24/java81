package src.main.java.com.tuempresa.proyecto.services;
import src.main.java.com.tuempresa.proyecto.models.Materia;
import src.main.java.com.tuempresa.proyecto.repository.MateriaRepository;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }
}
