package mat.ned.mechanics.maps.placesMaps;

import java.io.IOException;

public class RandomSwampRoad extends RandomRoadPlace {

    public RandomSwampRoad() throws IOException {
        TREE_CHANCE = 20;
        BUSH_CHANCE = 50;
        WATER_CHANCE = 80;
        SWAMP_CHANCE = 200;

        saveRandomPlace();
        splitLoadedDataToMapArray(path);
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_CYAN,".");
    }
}
