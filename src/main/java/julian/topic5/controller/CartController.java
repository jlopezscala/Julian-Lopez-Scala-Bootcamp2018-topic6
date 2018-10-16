package julian.topic5.controller;

import io.swagger.annotations.Api;
import julian.topic5.entity.Cart;
import julian.topic5.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value="onlinestoreCart", description="Operations pertaining to products in Online Store")
@RestController
public class CartController {

    @Autowired
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(path = "/carts/{id}")
    Cart getCart(@RequestParam int id) {
        return cartService.getCart(id);
    }

    @DeleteMapping(path = "/carts/{id}")
    void deleteCart(@RequestParam int id) {
        cartService.deleteCart(id);
    }
}
