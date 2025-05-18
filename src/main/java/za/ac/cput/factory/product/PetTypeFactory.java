package za.ac.cput.factory.product;
/*Oluhle Makhaye
 * 222419636*/

import za.ac.cput.domain.product.PetType;
import za.ac.cput.util.Helper;

public class PetTypeFactory {
    public static PetType createPetType(int petTypeID, String petTypeName) {
        if (Helper.isNullOrEmpty(petTypeName)) return null;
        return new PetType.Builder()
                .setPetTypeID(petTypeID)
                .setPetTypeName(petTypeName)
                .build();
    }
}
