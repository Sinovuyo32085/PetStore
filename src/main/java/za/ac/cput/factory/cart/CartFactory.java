/* CartFactory.java

     Cart factory class

     Author: Elethu Manikivana (221195521)

     Date: 17 May 2025 */
package za.ac.cput.factory.cart;

import za.ac.cput.domain.cart.Cart;
import za.ac.cput.domain.cart.CartItem;

import java.util.List;

public class CartFactory {
 public static Cart createCart(int cartID, int userID, List<CartItem> items) {
     if (items == null)
         return null;
      return new Cart.Builder().setCartID(cartID)
              .setUserID(userID)
              .setItems(items)
              .build();
 }

}
