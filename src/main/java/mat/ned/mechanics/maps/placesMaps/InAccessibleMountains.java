package mat.ned.mechanics.maps.placesMaps;

import java.io.IOException;

public class InAccessibleMountains extends RandomPlace{

    public InAccessibleMountains() throws IOException {
        TREE_CHANCE = 3;
        BUSH_CHANCE = 1;
        WATER_CHANCE = 1;
        SWAMP_CHANCE = 1;
        isAccessible = false;
        saveRandomPlace();
        splitLoadedDataToMapArray(path);
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_BLACK,"^");
    }
}
