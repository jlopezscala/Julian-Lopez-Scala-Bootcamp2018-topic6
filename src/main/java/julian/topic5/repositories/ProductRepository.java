package julian.topic5.repositories;

import julian.topic5.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<Product, Integer> {
}
