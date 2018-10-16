package julian.topic5.controller;

import io.swagger.annotations.Api;
import julian.topic5.entity.Product;
import julian.topic5.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Api(value="onlinestoreProduct", description="Operations pertaining to products in Online Store")
@RestController
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {

        this.productService = productService;
    }

    @GetMapping(path = "/product")
    List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping(path = "/products/{id}")
    Product getProduct(@RequestParam int id){
        return productService.getProduct(id);
    }

    @PostMapping(path = "/product/add")
    Product addProduct(@RequestParam (name = "name") String name,
                       @RequestParam (name = "price") float price){
        Product product = new Product(name, price);
        return productService.addProduct(product);
    }

    @DeleteMapping(path = "/products/{id}")
    void deleteProduct (@RequestParam int id){
        productService.deleteProduct(id);
    }
}
