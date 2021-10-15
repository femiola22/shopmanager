package tech.target.shopmanager.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.target.shopmanager.models.CartItem;
import tech.target.shopmanager.services.CartItemService;

import java.util.List;

@RestController
@RequestMapping("/cartitem")
public class CartItemResource {
    private final CartItemService cartItemService;

    public CartItemResource(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CartItem>> getAllCartItems(){
        List<CartItem> cartItems = cartItemService.findAllCartItem();
        return new ResponseEntity<>(cartItems, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CartItem> getCartItemById(@PathVariable("id") Long id){
        CartItem cartItem = cartItemService.findCartItemById(id);
        return new ResponseEntity<>(cartItem,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<CartItem> addCartItem(@RequestBody CartItem cartItem){
        CartItem newCartItem = cartItemService.addCartItem(cartItem);
        return new ResponseEntity<>(newCartItem,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<CartItem> updateCartItem(@RequestBody CartItem cartItem){
        CartItem updatedCartItem = cartItemService.updateCartItem(cartItem);
        return new ResponseEntity<>(updatedCartItem,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCartItem(@PathVariable("id") Long id){
        cartItemService.deleteCartItem(id);
        return new ResponseEntity<>("CartItem with id: "+id+" deleted successfully",HttpStatus.OK);
    }
}
