package mat.ned.mechanics.witcher;

import mat.ned.mechanics.Species;

public class Witcher extends Species {

    public Witcher() {
        this.weakenAmount = 0;
        this.hp = 50;
        this.mana = 10;
    }

    public Witcher(String name) {
        this.weakenAmount = 0;
        this.name = name;
        this.hp = 50;
        this.mana = 10;
    }

    @Override
    public String typeOfSpecies() {
        return "Witcher";
    }

    @Override
    public String toString() {
        return "@";
    }


}
