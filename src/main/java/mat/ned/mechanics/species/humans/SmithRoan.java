package mat.ned.mechanics.species.humans;

import mat.ned.mechanics.species.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class SmithRoan  extends Species {

    public SmithRoan(String name) {
        this.weakenAmount = 0;
        this.name = "Roan";
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    private static final int BASE_HP = 80;
    private static final int BASE_MANA = 10;
    private static final int BASE_STRENGTH = 20;

    @Override
    public void action(int choice) {
        //TODO choice is static at the moment
        choice = 1;
        switch (choice) {
            case 1:
                talk("I am the only smith in this city.");
                break;
            case 2:
                System.out.println("TODO - attack");
                break;
            case 3:
                System.out.println("TODO - SHOP");
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
        return "Smith Roan";
    }


    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_PURPLE, "s");
    }


}
