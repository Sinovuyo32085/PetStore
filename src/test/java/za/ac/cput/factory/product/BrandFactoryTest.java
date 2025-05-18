package za.ac.cput.factory.product;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.product.Brand;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class BrandFactoryTest {

    private static Brand brandWithoutName = BrandFactory.createBrand(1,"");
    private static Brand validBrand = BrandFactory.createBrand(2,"Montego");


    @Test
    void createValidBrand(){
        assertNotNull(validBrand);
        System.out.println(validBrand);
    }

    @Test
    void createBrandWithoutBrandName(){
        assertNull(brandWithoutName);
        System.out.println(brandWithoutName);
    }

//    @Test
//    void createBrandWithInvalidBrandID(){
//        Brand brand = BrandFactory.createBrand(one,"Royal Canin");
//        assertNotNull(brand);
//        System.out.println(brand.toString());
//    }

}
