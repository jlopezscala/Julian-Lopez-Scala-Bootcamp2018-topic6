package julian.topic5.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name="user")
public class User {

    private @Id @GeneratedValue Integer id;
    private String username;
    private String password;

    public User (String username, String password){
        this.username = username;
        this.password = password;
    }
}

