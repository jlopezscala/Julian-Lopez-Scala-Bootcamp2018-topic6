package julian.topic5.services;

import julian.topic5.entity.User;

import java.util.List;

public interface userService {

    User newUser(User user);
    User getUser(int id);
    List<User> getAllUsers();
    void updateUser();
    void deleteUser();
}
