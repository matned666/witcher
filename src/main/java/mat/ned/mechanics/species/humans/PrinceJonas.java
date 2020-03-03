package mat.ned.mechanics.species.humans;

import mat.ned.mechanics.species.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class PrinceJonas  extends Species {


    public PrinceJonas() {
        this.weakenAmount = 0;
        this.name = "Jonas";
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    private static final int BASE_HP = 90;
    private static final int BASE_MANA = 50;
    private static final int BASE_STRENGTH = 60;

    @Override
    public void action(int choice) {
//TODO choice is static at the moment
        choice = 1;
        switch (choice) {
            case 1:
                talk("Days are getting shorter, war is coming, we must prepare troops...");
                break;
            case 2:
                System.out.println("TODO - attack");
                break;
            case 3:
                System.out.println("TODO - quest");
                break;
            default:
                System.out.println("Do nothing");
                break;

        }

    }


    @Override
    public String typeOfSpecies() {
        return "Prince Jonas";
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_BLUE, "P");
    }


}
