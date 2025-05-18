package za.ac.cput.factory.product;
/*Oluhle Makhaye
 * 222419636*/

import za.ac.cput.domain.product.FoodType;
import za.ac.cput.domain.product.PetType;
import za.ac.cput.util.Helper;

public class FoodTypeFactory {
    public static FoodType createFoodType(int foodTypeID, String foodTypeName, PetType petType) {
        if (Helper.isNullOrEmpty(foodTypeName)) return null;
        return new FoodType.Builder()
                .setFoodTypeID(foodTypeID)
                .setFoodTypeName(foodTypeName)
                .setPetType(petType)
                .build();
    }
}
