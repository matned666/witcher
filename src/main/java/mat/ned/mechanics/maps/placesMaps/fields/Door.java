package mat.ned.mechanics.maps.placesMaps.fields;

import mat.ned.mechanics.Species;

public class Door extends MapField  {

    private boolean isOpen;

    public Door() {
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public void setAccessible(boolean accessible) {
        this.isAccessible = accessible;

    }

    @Override
    public boolean isAccessible() {
        return this.isAccessible;
    }

    @Override
    public void fieldEffects(Species species) {
    }



    @Override
    public String toString() {
        if(!isOpen) return "+";
        else return "/";
    }

    @Override
    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public void action(Species species) {
        if(!isOpen){
            setOpen(true);
            setAccessible(true);
        }
        else {
            setOpen(false);
            setAccessible(false);
        }
    }
}
