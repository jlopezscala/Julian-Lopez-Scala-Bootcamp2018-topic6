package julian.topic5.controller;


import julian.topic5.entity.Product;
import julian.topic5.repositories.CartRepository;
import julian.topic5.repositories.ProductRepository;
import julian.topic5.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/products")
    List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping(path = "/products/{id}")
    Product getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }

    @PostMapping(path = "/products/add")
    Product addProduct(@RequestParam (name = "name") String name,
                       @RequestParam (name = "price") float price){
        Product product = new Product(name, price);
        return productService.addProduct(product);
    }


}
