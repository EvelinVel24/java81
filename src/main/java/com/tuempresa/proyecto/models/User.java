package src.main.java.com.tuempresa.proyecto.models;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String email;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Role> roles;

    // Getters y Setters
}

