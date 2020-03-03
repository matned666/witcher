package mat.ned.mechanics.species.humans;

import mat.ned.mechanics.species.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class OldClericKaritt  extends Species {

    public OldClericKaritt() {
        this.weakenAmount = 0;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    public OldClericKaritt(String name) {
        this.weakenAmount = 0;
        this.name = name;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    private static final int BASE_HP = 34;
    private static final int BASE_MANA = 200;
    private static final int BASE_STRENGTH = 10;

    @Override
    public void action(int choice) {
        //TODO choice is static at the moment
        choice = 1;
        switch (choice) {
            case 1:
                talk("The gods seeeee, war is comin.");
                break;
            case 2:
                System.out.println("TODO - attack");
                break;
            case 4:
                System.out.println("TODO - quest");
                break;
            default:
                System.out.println("Do nothing");
                break;

        }

    }

    @Override
    public String typeOfSpecies() {
        return "Old Cleric Karitt";
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_BLACK, "K");
    }


}
