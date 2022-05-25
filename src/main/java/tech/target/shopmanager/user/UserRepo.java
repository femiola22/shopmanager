package tech.target.shopmanager.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long id);
    Optional<User> findUserById(Long id);
}
