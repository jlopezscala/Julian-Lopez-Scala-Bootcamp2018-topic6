package julian.topic5.entity;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data

public class User {

    private int id;
    private String username;
    private String password;
}
