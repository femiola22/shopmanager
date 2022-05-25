package tech.target.shopmanager.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.target.shopmanager.exceptions.GeneralNotFoundException;

import java.util.List;

@Service
@Transactional
public class CartItemService {

    private final CartItemRepo cartItemRepo;

    @Autowired
    public CartItemService(CartItemRepo cartItemRepo) {
        this.cartItemRepo = cartItemRepo;
    }

    public CartItem addCartItem(CartItem cartItem){
        return cartItemRepo.save(cartItem);
    }

    public List<CartItem> findAllCartItem(){
        return cartItemRepo.findAll();
    }

    public CartItem updateCartItem(CartItem cartItem){
        return cartItemRepo.save(cartItem);
    }

    public CartItem findCartItemById(Long id){
        return cartItemRepo.findCartItemById(id)
                .orElseThrow(() -> new GeneralNotFoundException(id + " was not found"));
    }

    public void deleteCartItem(Long id){
        cartItemRepo.deleteCartItemById(id);
    }

}
