package mat.ned.mechanics.maps.placesMaps;

import java.io.IOException;

public class RandomForest extends RandomPlace{

    public RandomForest() throws IOException {
        TREE_CHANCE = 150;
        BUSH_CHANCE = 50;
        WATER_CHANCE = 4;
        SWAMP_CHANCE = 3;

        saveRandomPlace();
        splitLoadedDataToMapArray(path);
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_GREEN,"f");
    }
}
