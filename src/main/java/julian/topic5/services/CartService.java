package julian.topic5.services;

import julian.topic5.entity.Cart;
import julian.topic5.entity.Product;
import julian.topic5.repositories.CartRepository;
import julian.topic5.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CartService {

    private CartRepository cartRepository;
    private ProductRepository productRepository;

    public Cart addProduct(Product product){


    }

}
