package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.placesMaps.Place;
import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.io.FileNotFoundException;

public class Sanctuary extends Place {

    public Sanctuary() throws FileNotFoundException {
        this.isAccessible = true;
        this.getPlaceType = MapStageType.CITY;
        path = "src/main/resources/Sanctuary.map";
        splitLoadedDataToMapArray(path);
    }

    @Override
    public boolean isAccessible() {
        return this.isAccessible;
    }

    @Override
    public void action() {

    }

    @Override
    public MapStageType getPlaceType() {
        return this.getPlaceType;
    }

}