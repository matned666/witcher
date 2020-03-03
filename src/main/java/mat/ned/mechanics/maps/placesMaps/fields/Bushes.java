package mat.ned.mechanics.maps.placesMaps.fields;

import mat.ned.mechanics.species.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class Bushes extends MapField {
    @Override
    public void fieldEffects(Species species) {

    }

    @Override
    public String toString() {
        return Colored.get( Colored.ANSI_GREEN,"p");
    }

    @Override
    public void setOpen(boolean open) {

    }

    @Override
    public void action(Species species) {

    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public void setAccessible(boolean accessible) {
        this.isAccessible = accessible;

    }

    @Override
    public boolean isAccessible() {
        return this.isAccessible;
    }
}
