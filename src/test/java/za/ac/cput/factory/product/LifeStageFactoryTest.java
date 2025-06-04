package za.ac.cput.factory.product;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.product.LifeStage;

import static org.junit.jupiter.api.Assertions.*;

class LifeStageFactoryTest {

    private static LifeStage lifeStageWithoutName = LifeStageFactory.createLifeStage(100,"");
    private static LifeStage validLifeStage = LifeStageFactory.createLifeStage(101,"Adult");

    @Test
    public void createValidLifeStage() {
        assertNotNull(validLifeStage);
        System.out.println(validLifeStage.toString());
    }

    @Test
    public void createLifeStageWithoutName() {
        assertNull(lifeStageWithoutName);
        System.out.println(lifeStageWithoutName.toString());
    }
}