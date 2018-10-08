package julian.topic5.services;

import julian.topic5.entity.Cart;

public interface cartService {

    Cart addCart(Cart cart);
    Cart getCart(int id);
    void updateCart(Cart cart, int id);
    void deleteCart(int id);
}
