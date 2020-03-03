package mat.ned.mechanics.species.humans;

import mat.ned.mechanics.species.Species;

public class Witcher extends Species {

    private static final int BASE_HP = 50;
    private static final int BASE_MANA = 20;
    private static final int BASE_STRENGTH = 40;

    public Witcher() {
        this.weakenAmount = 0;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    public Witcher(String name) {
        this.weakenAmount = 0;
        this.name = name;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    @Override
    public void action(int choice) {
//TODO choice is static at the moment
        choice = 1;
        switch (choice) {
            case 1:
                talk("Damn it");
                break;
            case 2:
                System.out.println("TODO - attack");
                break;
            case 4:
                System.out.println("TODO - sparing");
                break;
            default:
                System.out.println("Do nothing");
                break;
        }
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
