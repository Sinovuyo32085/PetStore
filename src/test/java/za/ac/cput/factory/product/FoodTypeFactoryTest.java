package za.ac.cput.factory.product;
/*Oluhle Makhaye
 * 222419636*/

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.product.FoodType;
import za.ac.cput.domain.product.PetType;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class FoodTypeFactoryTest {
    private static FoodType validFoodType = FoodTypeFactory.createFoodType(2,"Wet Food");
    private static FoodType invalidFoodType = FoodTypeFactory.createFoodType(3,"");


    @Test
    void createValidFoodType() {
        assertNotNull(validFoodType);
        System.out.println(validFoodType);
    }

    @Test
    void createInvalidFoodType() {
        assertNull(invalidFoodType);
        System.out.println(invalidFoodType);
    }

}
