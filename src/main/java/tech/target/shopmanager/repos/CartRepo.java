package tech.target.shopmanager.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.target.shopmanager.models.Cart;

import java.util.Optional;

@Repository
public interface CartRepo extends JpaRepository <Cart, Long> {
    void deleteCartById(Long id);
    Optional<Cart> findCartById(Long id);
}
