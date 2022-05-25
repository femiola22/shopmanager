package tech.target.shopmanager.cart;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartResource {
    private final CartService cartService;

    public CartResource(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Cart>> getAllCart(){
        List<Cart> carts = cartService.findAllCart();
        return new ResponseEntity<>(carts, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Cart> getCartById(@PathVariable("id") Long id){
        Cart cart = cartService.findCartById(id);
        return new ResponseEntity<>(cart,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Cart> addCart(@RequestBody Cart cart){
        Cart newCart = cartService.addCart(cart);
        return new ResponseEntity<>(newCart,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Cart> updateCart(@RequestBody Cart cart){
        Cart updatedCart = cartService.updateCart(cart);
        return new ResponseEntity<>(updatedCart,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCart(@PathVariable("id") Long id){
        cartService.deleteCart(id);
        return new ResponseEntity<>("Cart with id: "+id+" deleted successfully",HttpStatus.OK);
    }
}
