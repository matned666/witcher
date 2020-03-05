package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.worldMap.MapStageType;
import java.io.FileNotFoundException;

public class CityOfAvalon extends Place {

    public CityOfAvalon() throws FileNotFoundException {
        this.isAccessible = true;
        this.getPlaceType = MapStageType.CITY;
        path = "src/main/resources/CityOfAvalon.map";
        splitLoadedDataToMapArray(path);
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_YELLOW,Colored.ANSI_BLACK,"C");
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
