package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.io.FileNotFoundException;

public class ForestHut extends Place {

    public ForestHut() throws FileNotFoundException {
        this.isAccessible = true;
        this.getPlaceType = MapStageType.FORREST;
        path = "src/main/resources/ForestHut.map";
        splitLoadedDataToMapArray(path);
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_YELLOW,"H");
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
