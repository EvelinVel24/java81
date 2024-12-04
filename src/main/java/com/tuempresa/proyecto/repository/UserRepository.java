package src.main.java.com.tuempresa.proyecto.repository;
import src.main.java.com.tuempresa.proyecto.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
