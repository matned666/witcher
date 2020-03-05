package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.io.FileNotFoundException;

public class WaterPlace extends Place {

    public WaterPlace() throws FileNotFoundException {
        this.isAccessible = false;
        splitLoadedDataToMapArray("src/main/resources/Water.map");
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_BLUE,"=");
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