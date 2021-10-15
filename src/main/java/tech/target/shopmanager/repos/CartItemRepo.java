package tech.target.shopmanager.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.target.shopmanager.models.CartItem;

import java.util.Optional;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Long> {
    void deleteCartItemById(Long id);
    Optional<CartItem> findCartItemById(Long id);
}
