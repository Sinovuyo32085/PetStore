package za.ac.cput.factory.product;
/*Oluhle Makhaye
 * 222419636*/

import za.ac.cput.domain.product.Product;
import za.ac.cput.util.Helper;

public class ProductFactory {
    public static Product createProduct(int productID, String productName, String description) {
        if (Helper.isNullOrEmpty(productName) || Helper.isNullOrEmpty(description)) return null;
        return new Product.Builder()
                .setProductID(productID)
                .setProductName(productName)
                .setDescription(description)
                .build();
    }
}
