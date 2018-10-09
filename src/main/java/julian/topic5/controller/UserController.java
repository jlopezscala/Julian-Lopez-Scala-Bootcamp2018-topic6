package julian.topic5.controller;

import julian.topic5.entity.User;
import julian.topic5.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private final UserRepository repository;

    UserController(UserRepository userRepository){
        this.repository = userRepository;
    }

    @GetMapping(path = "/users")
    List<User> all(){
        return repository.findAll();
    }

    @PostMapping(path ="/users/add")
    User addUser(@RequestParam(name = "username") String username,
                 @RequestParam(name = "password") String password){
        User usuario = new User(username, password);
        return repository.save(usuario);
    }

    @GetMapping(path= "/users/{id}")
    User getUser(@PathVariable int id) {
        User usuario = repository.getOne(id);
        return usuario;
    }

}

