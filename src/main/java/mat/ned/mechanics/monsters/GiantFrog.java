package mat.ned.mechanics.monsters;


import mat.ned.mechanics.maps.placesMaps.Colored;

public class GiantFrog extends Monster {


    public GiantFrog() {
        this.weakenAmount = 0;
        this.hp = 30;
        this.mana = 6;
        this.isWaterBreathing = true;
    }

    public GiantFrog(String name) {
        this.weakenAmount = 0;
        this.name = name;
        this.hp = 30;
        this.mana = 6;
    }

    @Override
    public String typeOfSpecies() {
        return "Giant frog";
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_GREEN, "F");
    }


}
