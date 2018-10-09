package julian.topic5.controller;

import julian.topic5.entity.User;
import julian.topic5.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    List<User> all(){
        return userService.getAll();
    }

    @PostMapping(path ="/users/add")
    User addUser(@RequestParam(name = "username") String username,
                 @RequestParam(name = "password") String password){
        User usuario = new User(username, password);
        return userService.addUser(usuario);
    }

    @GetMapping(path= "/users/{id}")
    User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

}

