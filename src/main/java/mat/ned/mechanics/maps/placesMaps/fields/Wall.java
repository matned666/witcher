package mat.ned.mechanics.maps.placesMaps.fields;

import mat.ned.mechanics.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class Wall extends MapField  {

    public Wall() {
        isAccessible = false;
    }

    @Override
    public void fieldEffects(Species species) {

    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_BLACK, "#");
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
        this.isAccessible=accessible;
    }

    @Override
    public boolean isAccessible() {
        return false;
    }
}
