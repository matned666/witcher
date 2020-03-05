package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.io.FileNotFoundException;

public class ParametrizedMap  extends Place {

    public ParametrizedMap(String path) throws FileNotFoundException {
        this.isAccessible = true;
        this.getPlaceType = MapStageType.FORREST;
        this.path = path;

        splitLoadedDataToMapArray(path);
    }

    @Override
    public String toString() {
        return null;
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

    @Override
    public String getFileSign() {
        return null;
    }


}


