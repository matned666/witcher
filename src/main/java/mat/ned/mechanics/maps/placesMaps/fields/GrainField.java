package mat.ned.mechanics.maps.placesMaps.fields;

import mat.ned.mechanics.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class GrainField extends MapField  {
    @Override
    public void fieldEffects(Species species) {

    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_YELLOW,"=");
    }
}
