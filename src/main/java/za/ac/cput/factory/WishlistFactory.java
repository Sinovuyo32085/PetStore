/*
   Nkheso Senior Mathebula 230762883
*/
package za.ac.cput.factory;
import za.ac.cput.domain.Wishlist;
import za.ac.cput.domain.product.Product;
import za.ac.cput.domain.user.User;
import java.util.List;

public class WishlistFactory {
    public static Wishlist createWishlist(int wishlistId, User user, List<Product> items) {
        if (user == null || items == null || items.isEmpty())
            return null;

        return new Wishlist.Builder()
                .setWishlistId(wishlistId)
                .setUser(user)
                .setItems(items)
                .build();
    }
}

