package julian.topic5.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
@Builder
public class User {

    private @Id @GeneratedValue int id;
    private String username;
    private String password;

    public User (String username, String password){
        this.username = username;
        this.password = password;
    }

}

