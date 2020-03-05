package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.io.FileNotFoundException;

public class TowerOfMages extends Place {

    public TowerOfMages() throws FileNotFoundException {
        this.isAccessible = true;
        this.getPlaceType = MapStageType.FORREST;
        splitLoadedDataToMapArray("src/main/resources/TowerOfMAgesLvl1.map");
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_YELLOW,"T");
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