package mat.ned.mechanics.maps.placesMaps.fields;

import mat.ned.mechanics.species.Species;

public class StairsDown extends MapField  {

    public StairsDown() {
        isAccessible = true;
    }

    @Override
    public void fieldEffects(Species species) {

    }

    @Override
    public String toString() {
        return "\\";
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
