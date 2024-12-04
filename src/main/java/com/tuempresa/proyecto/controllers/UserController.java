package src.main.java.com.tuempresa.proyecto.controllers;
import src.main.java.com.tuempresa.proyecto.models.User;
import src.main.java.com.tuempresa.proyecto.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signin")
    public String signin(@RequestBody Map<String, String> body) {
        return userService.signin(body.get("username"), body.get("password"));
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return userService.signup(user);
    }
}
