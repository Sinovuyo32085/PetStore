package za.ac.cput.factory.product;
/*Oluhle Makhaye
* 222419636*/

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.product.PetType;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class PetTypeFactoryTest {

    private static PetType validPetType = PetTypeFactory.createPetType(1,"Cat");
    private static PetType invalidPetType = PetTypeFactory.createPetType(2,"");

    @Test
    void createPetType() {
        assertNotNull(validPetType);
        System.out.println(validPetType);
    }

    @Test
    void createNullPetType() {
        assertNull(invalidPetType);
        System.out.println(invalidPetType);
    }
}
