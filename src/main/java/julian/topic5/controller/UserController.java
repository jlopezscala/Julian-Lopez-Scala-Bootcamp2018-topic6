package julian.topic5.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import julian.topic5.entity.User;
import julian.topic5.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value="onlinestoreUser", description="Operations pertaining to products in Online Store")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping(path = "/users")
    List<User> all() {
        return userService.getAll();
    }

    @PostMapping(path = "/users/add")
    User addUser(@RequestParam(name = "username") String username,
                 @RequestParam(name = "password") String password) {
        User user = new User(username, password);
        return userService.addUser(user);
    }

    @GetMapping(path = "/user")
    User getUser(@RequestParam("id") Integer id) {
        return userService.getUser(id);
    }

    
    @DeleteMapping(path = "/users/{id}")
    void deleteUser(@RequestParam int id) {
        userService.deleteUser(id);
    }
}

