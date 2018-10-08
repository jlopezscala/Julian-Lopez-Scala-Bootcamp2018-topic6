package julian.topic5.controller;

import julian.topic5.entity.User;
import julian.topic5.exceptions.UserNotFoundException;
import julian.topic5.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository userRepository){
        this.repository = userRepository;
    }

    @GetMapping("/users")
    List<User> all(){
        return repository.findAll();
    }

    @PostMapping("/users")
    User newUser(@RequestBody User newUser){
        return repository.save(newUser);
    }

    @GetMapping("/users/{id}")
    User getUser(@PathVariable int id) {
        return repository.findById(id).orElseThrow(() -> new Exception());
    }








}

