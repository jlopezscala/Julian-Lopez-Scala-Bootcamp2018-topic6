package julian.topic5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
public class Cart {

    private ArrayList<Integer> cart;
    private float subtotal;
    private @Id @GeneratedValue int id;

    public Cart (){
        cart = new ArrayList<Integer>();
        subtotal = 0;
    }
}
