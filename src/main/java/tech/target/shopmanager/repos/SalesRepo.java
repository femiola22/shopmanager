package tech.target.shopmanager.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.target.shopmanager.models.Sales;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface SalesRepo extends JpaRepository<Sales, Long> {
    void deleteSalesById(Long id);
    Optional<Sales> findSalesById(Long id);
    Optional<Sales> findSalesByDateTime(String dateTime);
    Optional<Sales> findSalesByDateTimeBetween(String dateTime1, String dateTime2);
}
