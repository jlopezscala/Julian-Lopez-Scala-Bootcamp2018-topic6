package julian.topic5.services;

import julian.topic5.entity.User;
import julian.topic5.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User getUser(Integer id){
        return userRepository.getOne(id);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public void updateUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
