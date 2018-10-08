package julian.topic5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cart {

    private ArrayList<Product> cart;
    private int id;

}
