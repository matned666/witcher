package mat.ned.mechanics.maps.placesMaps;

import java.io.IOException;

public class RandomDeepForestRoad extends RandomRoadPlace {

    public RandomDeepForestRoad() throws IOException {
        TREE_CHANCE = 400;
        BUSH_CHANCE = 200;
        WATER_CHANCE = 8;
        SWAMP_CHANCE = 30;

        saveRandomPlace();
        splitLoadedDataToMapArray(path);
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_GREEN,".");
    }
}
