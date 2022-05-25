package tech.target.shopmanager.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import tech.target.shopmanager.cart.Cart;
import tech.target.shopmanager.cart.CartRepo;
import tech.target.shopmanager.cart.CartService;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class CartServiceTest {

    private CartRepo cartRepo;
    private Cart cart;
    private CartService cartService;

    @BeforeEach
    void setUp() {
        cartRepo = Mockito.mock(CartRepo.class);
        cartService = new CartService(cartRepo);

    }

    @Test
    void canAddToCart() {
        // given
        cart = new Cart(
                null,
                1l,
                "2021-05-17 22:52:21",
                true
        );

        // when
        cartService.addCart(cart);

        // then
        ArgumentCaptor<Cart> cartArgumentCaptor = ArgumentCaptor.forClass(Cart.class);

        verify(cartRepo).save(cartArgumentCaptor.capture());

        Cart capturedCart = cartArgumentCaptor.getValue();

        assertThat(capturedCart).isEqualTo(cart);
    }

    @Test
    void when_findAllCart_ReturnNotNullList() {
        when(cartRepo.findAll())
                .thenReturn(Collections.emptyList());
        final List<Cart> list = cartService.findAllCart();
        assertThat(list).isNotNull();
        verify(cartRepo).findAll();
    }

    @Test
    void updateCart() {
    }

    @Test
    void findCartById() {
    }

    @Test
    void deleteCart() {
    }
}
