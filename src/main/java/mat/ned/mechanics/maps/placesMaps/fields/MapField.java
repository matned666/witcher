package mat.ned.mechanics.maps.placesMaps.fields;

import mat.ned.mechanics.Species;
import mat.ned.mechanics.maps.placesMaps.FieldType;

import java.util.List;

public abstract class MapField<E> {



    protected FieldType fieldType;
    protected List<E> listOfEffects;

    public abstract void fieldEffects(Species species);

    public abstract String toString();



}
