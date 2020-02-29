package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.placesMaps.fields.MapField;
import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.util.List;

public abstract class Place {

    protected final static int ROWS = 30;
    protected final static int COLUMNS = 50;
    protected boolean isAccessible;
    protected MapStageType getPlaceType;
    protected MapField[][] matrix;
    protected List<FieldType> listOfFieldTypes;

    public abstract boolean isAccessible();
    public abstract MapStageType getPlaceType();
    public abstract List<FieldType> getPossibleFieldTypesInTheArea();
    public abstract MapField[][] getMatrix();
    public abstract void print();


}
