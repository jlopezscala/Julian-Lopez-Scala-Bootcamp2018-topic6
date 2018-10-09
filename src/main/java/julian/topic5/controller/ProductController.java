package julian.topic5.controller;


import julian.topic5.entity.Product;
import julian.topic5.repositories.CartRepository;
import julian.topic5.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/products")
    List<Product> getAll(){
        return repository.findAll();
    }

    @GetMapping(path = "/products/{id}")
    Product getProduct(@PathVariable int id){
        Product product = repository.getOne(id);
        return product;
    }
    @PostMapping(path = "/products/add")
    Product addProduct(@RequestParam (name = "name") String name,
                       @RequestParam (name = "price") float price){
        Product product = new Product(name, price);
        repository.save(product);
        return product;
    }


}
