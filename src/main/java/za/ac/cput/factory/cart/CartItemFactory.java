/* CartItemFactory.java

     CartItem factory class

     Author: Elethu Manikivana (221195521)

     Date: 17 May 2025 */
package za.ac.cput.factory.cart;

import za.ac.cput.domain.cart.Cart;
import za.ac.cput.domain.cart.CartItem;

public class CartItemFactory {
    public static CartItem createCartItem(int cartItemId,int productId ,int quantity ) {
        if (productId<=0 || quantity<=0)
            return null;
        return new CartItem.Builder().setCartItemId(cartItemId)
                .setProductId(productId)
                .setQuantity(quantity)
                .build();
    }
}
