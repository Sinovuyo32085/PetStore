package za.ac.cput.factory.product;
/*Oluhle Makhaye
 * 222419636*/

import za.ac.cput.domain.product.Brand;
import za.ac.cput.util.Helper;

public class BrandFactory {
    public static Brand createBrand(int brandID, String brandName) {
        if (Helper.isNullOrEmpty(brandName)) return null;
        return new Brand.Builder()
                .setBrandID(brandID)
                .setBrandName(brandName)
                .build();
    }
}
