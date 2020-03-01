package mat.ned.mechanics.maps.placesMaps.fields;

import mat.ned.mechanics.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;
import mat.ned.mechanics.maps.placesMaps.fields.MapField;

public class Swamp extends MapField {

    public Swamp() {
        isAccessible = true;
    }

    @Override
    public void fieldEffects(Species species) {

    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_YELLOW, "_");
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
