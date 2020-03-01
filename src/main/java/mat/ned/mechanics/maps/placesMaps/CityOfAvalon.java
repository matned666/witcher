package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.worldMap.MapStageType;
import java.io.FileNotFoundException;

public class CityOfAvalon extends Place {

    public CityOfAvalon() throws FileNotFoundException {
        this.isAccessible = true;
        this.getPlaceType = MapStageType.CITY;
        path = "C:\\Users\\Perun\\Downloads\\Witcher\\src\\main\\resources\\CityOfAvalon.map";
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
