package za.ac.cput.factory.cart;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.cart.Cart;
import za.ac.cput.domain.cart.CartItem;
import za.ac.cput.domain.order.OrderItem;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartFactoryTest {

 //   List<CartItem> items = new ArrayList<>();
 //   CartItem items = new CartItem(100 , 2557, 2);
 //   CartItem.add(items);
    private static Cart cartWithoutItems = CartFactory.createCart(101,2556,null);
 //   private static Cart cartWithItems = CartFactory.createCart(102,2556,);

    @Test
    public void createCartWithoutItems() {
        assertNull(cartWithoutItems);
        System.out.println(cartWithoutItems.toString());
    }

    @Test
    public void createCartWithItems() {
   //     assertNotNull(cartWithItems.);
   //     System.out.println(cartWithItems.toString());
    }
}