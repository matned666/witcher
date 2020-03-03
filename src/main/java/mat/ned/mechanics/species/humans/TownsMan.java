package mat.ned.mechanics.species.humans;

import mat.ned.mechanics.species.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class TownsMan  extends Species {


    public TownsMan() {
        this.weakenAmount = 0;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    public TownsMan(String name) {
        this.weakenAmount = 0;
        this.name = name;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    private static final int BASE_HP = 23;
    private static final int BASE_MANA = 0;
    private static final int BASE_STRENGTH = 15;


    @Override
    public void action(int choice) {
        //TODO choice is static at the moment
        choice = 1;
        switch (choice) {
            case 1:
                talk("I have a lot of work to do...");
                break;
            case 2:
                System.out.println("TODO - attack");
                break;
            case 4:
                System.out.println("TODO - scare");
                break;
            default:
                System.out.println("Do nothing");
                break;

        }

    }

    @Override
    public String typeOfSpecies() {
        return "Town man";
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_YELLOW, "t");
    }


}
