package tech.target.shopmanager.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepo extends JpaRepository<Cart, Long> {
    void deleteCartById(Long id);

    Optional<Cart> findCartById(Long id);
}
