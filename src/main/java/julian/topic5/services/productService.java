package julian.topic5.services;

import julian.topic5.entity.Product;

public interface productService {

    Product addProduct(Product product);
    Product getProduct(int id);
    void updateProduct(Product product);
    void deleteProduct(int id);

}
