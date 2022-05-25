package tech.target.shopmanager.repos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.target.shopmanager.cart.CartItem;
import tech.target.shopmanager.cart.CartItemRepo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CartItemRepoTest {

    @Autowired
    private CartItemRepo cartItemRepo;

    private CartItem cartItem;

    @BeforeEach
    void setUp() {
         cartItem = new CartItem(
            null,
            2L,
            8L,
            15,
            3000.32
    );
        cartItemRepo.save(cartItem);
    }

    @Test
    void deleteCartItemById() {

    }

    @Test
    void findCartItemById() {
        // given
       long quantityExpected =  15;

       // when
        int quantityOfCartItem = cartItemRepo.findCartItemById(cartItem.getId()).get().getQuantity();

        // then
        assertThat(quantityOfCartItem).isEqualTo(quantityExpected);
    }
}
