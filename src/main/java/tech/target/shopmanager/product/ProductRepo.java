package tech.target.shopmanager.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    void deleteProductById(Long id);
    Optional<Product> findProductById(Long id);
    @Query(value = "SELECT p from Product p where p.price < 500")
    public List<Product> getProductWithPriceLessThanOneThousand();
}
