package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.io.FileNotFoundException;

public class Forest1  extends Place {

    public Forest1() throws FileNotFoundException {
        this.isAccessible = true;
        this.getPlaceType = MapStageType.FORREST;
        path = "C:\\Users\\Perun\\Downloads\\Witcher\\src\\main\\resources\\Forest1.map";
        splitLoadedDataToMapArray(path);
    }

    @Override
    public boolean isAccessible() {
        return this.isAccessible;
    }

    @Override
    public MapStageType getPlaceType() {
        return this.getPlaceType;
    }

}
