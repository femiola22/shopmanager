package tech.target.shopmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.target.shopmanager.exceptions.ProductNotFoundException;
import tech.target.shopmanager.models.Product;
import tech.target.shopmanager.repos.ProductRepo;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product addProduct(Product product){
        product.setProductCode(UUID.randomUUID().toString());
        return productRepo.save(product);
    }

    public List<Product> findAllProducts(){
        return productRepo.findAll();
    }

    public Product updateProduct(Product product){
        return productRepo.save(product);
    }

    public Product findProductById(Long id){
        return productRepo.findProductById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product by id: "+id+" was not found"));
    }

    public void deleteProduct(Long id){
        productRepo.deleteProductById(id);
    }
}
