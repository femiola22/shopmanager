package tech.target.shopmanager.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.target.shopmanager.exceptions.GeneralNotFoundException;

import java.util.List;

@Service
@Transactional
public class CartService {
    private final CartRepo cartRepo;

    @Autowired
    public CartService(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }

    public Cart addCart(Cart cart){
        return cartRepo.save(cart);
    }

    public List<Cart> findAllCart(){
        return cartRepo.findAll();
    }

    public Cart updateCart(Cart cart){
        return cartRepo.save(cart);
    }

    public Cart findCartById(Long id){
        return cartRepo.findCartById(id)
                .orElseThrow(() -> new GeneralNotFoundException(id+" not found"));
    }

    public void deleteCart(Long id){
        cartRepo.deleteCartById(id);
    }
}
