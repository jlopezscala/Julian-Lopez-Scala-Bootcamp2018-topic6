package julian.topic5.services;

import julian.topic5.entity.Product;
import julian.topic5.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public Product getProduct(int id){
        return productRepository.getOne(id);

    }
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }

    public void updateProduct(Product product){
        productRepository.save(product);

    }
}

