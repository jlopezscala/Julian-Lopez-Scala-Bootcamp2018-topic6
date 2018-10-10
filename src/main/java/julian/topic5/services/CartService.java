package julian.topic5.services;

import julian.topic5.entity.Cart;
import julian.topic5.entity.Product;
import julian.topic5.repositories.CartRepository;
import julian.topic5.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart addCart(Cart cart){
        return cartRepository.save(cart);
    }

    public Cart getCart(int id){
        return cartRepository.getOne(id);
    }

    public List<Cart> getAll(){
        return cartRepository.findAll();
    }

    public float getTotal(Cart cart){
        return cart.getSubtotal();
    }

    public void deleteCart(int id){
        cartRepository.deleteById(id);
    }
}
