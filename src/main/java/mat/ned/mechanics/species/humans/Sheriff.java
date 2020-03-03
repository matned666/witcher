package mat.ned.mechanics.species.humans;

import mat.ned.mechanics.species.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class Sheriff  extends Species {

    public Sheriff() {
        this.weakenAmount = 0;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    public Sheriff(String name) {
        this.weakenAmount = 0;
        this.name = name;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    private static final int BASE_HP = 70;
    private static final int BASE_MANA = 20;
    private static final int BASE_STRENGTH = 50;

    @Override
    public void action(int choice) {
        //TODO choice is static at the moment
        choice = 1;
        switch (choice) {
            case 1:
                talk("If you don't cause any trouble, I don't care what you do...");
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
        return "Sheriff";
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_BLUE, "S");
    }


}
