package mat.ned.mechanics.maps.placesMaps;

import java.io.IOException;

public class RandomDeepForest extends RandomPlace{

    public RandomDeepForest() throws IOException {
        TREE_CHANCE = 400;
        BUSH_CHANCE = 200;
        WATER_CHANCE = 8;
        SWAMP_CHANCE = 30;


        saveRandomPlace();
        splitLoadedDataToMapArray(path);
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_GREEN,"F");
    }
}
