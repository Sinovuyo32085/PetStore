package za.ac.cput.factory.product;

import za.ac.cput.domain.product.LifeStage;
import za.ac.cput.util.Helper;

public class LifeStageFactory {
    public static LifeStage createLifeStage(int lifeStageID, String lifeStageName) {
        if (Helper.isNullOrEmpty(lifeStageName))
            return null;
        return new LifeStage.Builder().setLifeStageID(lifeStageID)
                .setLifeStageName(lifeStageName)
                .build();
    }
}
