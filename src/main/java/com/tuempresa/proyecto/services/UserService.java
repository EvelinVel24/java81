package src.main.java.com.tuempresa.proyecto.services;
import src.main.java.com.tuempresa.proyecto.models.User;
import src.main.java.com.tuempresa.proyecto.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    public String signin(String username, String password) {
        // Generar token JWT aquí
        return "Token";
    }

    public User signup(User user) {
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));
    }
}
