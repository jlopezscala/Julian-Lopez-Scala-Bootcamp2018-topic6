package julian.topic5.controller;

import julian.topic5.entity.Cart;
import julian.topic5.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(path = "/carts/{id}")
    Cart getCart(@PathVariable int id) {
        return cartService.getCart(id);
    }

    @DeleteMapping(path = "/carts")
    void deleteCart(@PathVariable int id) {
        cartService.deleteCart(id);
    }
}
