package tech.target.shopmanager.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Long> {
    void deleteCartItemById(Long id);
    Optional<CartItem> findCartItemById(Long id);
}
