package za.ac.cput.factory.cart;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.cart.CartItem;

import static org.junit.jupiter.api.Assertions.*;

class CartItemFactoryTest {

    private static CartItem validCartItem = CartItemFactory.createCartItem(101,2556,3);
    private static CartItem invalidCartItem1 = CartItemFactory.createCartItem(102,0,3);
    private static CartItem invalidCartItem2 = CartItemFactory.createCartItem(101,2553,0);

    @Test
    public void createCartItem() {
        assertNotNull(validCartItem);
        System.out.println(validCartItem.toString());
    }
    @Test
    public void createCartItemWithInvalidProductId() {
        assertNull(invalidCartItem1);
        System.out.println(invalidCartItem1.toString());
    }
    @Test
    public void createCartItemWithInvalidQuantity() {
        assertNull(invalidCartItem2);
        System.out.println(invalidCartItem2.toString());
    }
}