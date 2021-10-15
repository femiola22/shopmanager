package tech.target.shopmanager.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.target.shopmanager.models.Product;

import java.util.Optional;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    void deleteProductById(Long id);
    Optional<Product> findProductById(Long id);
}
