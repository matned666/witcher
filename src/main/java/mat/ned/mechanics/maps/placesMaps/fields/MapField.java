package mat.ned.mechanics.maps.placesMaps.fields;

import mat.ned.mechanics.Species;
import mat.ned.mechanics.maps.placesMaps.FieldType;

import java.util.List;

public abstract class MapField<E> {




    protected FieldType fieldType;
    protected List<E> listOfEffects;
    protected boolean isAccessible;
    protected Species speciesOnThis;

    public abstract void fieldEffects(Species species);

    public abstract String toString();

    public abstract void setOpen(boolean open);
    public abstract void action(Species species);

    public abstract boolean isOpen();

    public abstract void setAccessible(boolean accessible);


    public abstract boolean isAccessible();

    public void setSpeciesOnThis(Species species){
        this.speciesOnThis = species;
    }


    public Species getSpeciesOnThis(){
        return this.speciesOnThis;
    }
}
