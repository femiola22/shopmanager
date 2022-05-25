package tech.target.shopmanager.sales;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesResource {
    private final SalesService salesService;

    public SalesResource(SalesService salesService) {
        this.salesService = salesService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Sales>> getAllSales(){
        List<Sales> sales = salesService.findAllSales();
        return new ResponseEntity<>(sales, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Sales> getSalesById(@PathVariable("id") Long id){
        Sales sales = salesService.findSalesById(id);
        return new ResponseEntity<>(sales,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Sales> addSales(@RequestBody Sales sales){
        Sales newSales = salesService.addSales(sales);
        return new ResponseEntity<>(newSales,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Sales> updateSales(@RequestBody Sales sales){
        Sales updatedSales = salesService.updateSales(sales);
        return new ResponseEntity<>(updatedSales,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSales(@PathVariable("id") Long id){
        salesService.deleteSales(id);
        return new ResponseEntity<>("Sales with id: "+id+" deleted successfully",HttpStatus.OK);
    }

    @GetMapping("/find/datetime/{dateTime}")
    public ResponseEntity<Sales> findSalesByDateTime(@PathVariable("dateTime") String dateTime){
        Sales sales = salesService.findSalesByDateTime(dateTime);
        return new ResponseEntity<>(sales,HttpStatus.OK);
    }

    @GetMapping("/find/datetimepicker/{dateTime1},{dateTime2}")
    public ResponseEntity<Sales> findSalesByDateTimeBetween(@PathVariable("dateTime1") String dateTime1, @PathVariable("dateTime2") String dateTime2){
        Sales sales = salesService.findSalesByDateTimeBetween(dateTime1, dateTime2);
        return new ResponseEntity<>(sales,HttpStatus.OK);
    }
}
