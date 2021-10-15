package tech.target.shopmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.target.shopmanager.exceptions.GeneralNotFoundException;
import tech.target.shopmanager.models.Sales;
import tech.target.shopmanager.repos.SalesRepo;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class SalesService {

    private final SalesRepo salesRepo;

    @Autowired
    public SalesService(SalesRepo salesRepo) {
        this.salesRepo = salesRepo;
    }

    public Sales addSales(Sales sales){
        return salesRepo.save(sales);
    }

    public List<Sales> findAllSales(){
        return salesRepo.findAll();
    }

    public Sales updateSales(Sales sales){
        return salesRepo.save(sales);
    }

    public Sales findSalesById(Long id){
        return salesRepo.findSalesById(id)
                .orElseThrow(() -> new GeneralNotFoundException(id+" was not found"));
    }

    public void deleteSales(Long id){
        salesRepo.deleteSalesById(id);
    }

    public Sales findSalesByDateTime(String dateTime){
        return salesRepo.findSalesByDateTime(dateTime)
                .orElseThrow(() -> new GeneralNotFoundException(dateTime+" was not found"));
    }

    public Sales findSalesByDateTimeBetween(String dateTime1, String dateTime2){
        return salesRepo.findSalesByDateTimeBetween(dateTime1, dateTime2)
                .orElseThrow(() -> new GeneralNotFoundException("Sales between date: "
                        +dateTime1+" and "
                        +dateTime2+" was not found"));
    }
}
