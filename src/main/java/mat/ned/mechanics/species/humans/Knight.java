package mat.ned.mechanics.species.humans;

import mat.ned.mechanics.species.Species;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class Knight  extends Species {


    public Knight() {
        this.weakenAmount = 0;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    public Knight(String name) {
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
                talk("I have nothing to say, witcher...");
                break;
            case 2:
                System.out.println("TODO - attack");
                break;
            default:
                System.out.println("Do nothing");
                break;

                        }

    }

    @Override
    public String typeOfSpecies() {
        return "Knight";
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_BLUE, "G");
    }


}

