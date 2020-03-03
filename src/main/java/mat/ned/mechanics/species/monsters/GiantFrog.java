package mat.ned.mechanics.species.monsters;


import mat.ned.mechanics.maps.placesMaps.Colored;

public class GiantFrog extends Monster {


    public GiantFrog() {
        this.weakenAmount = 0;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
        this.isWaterBreathing = true;
    }

    public GiantFrog(String name) {
        this.weakenAmount = 0;
        this.name = name;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
        this.isWaterBreathing = true;
    }

    private static final int BASE_HP = 20;
    private static final int BASE_MANA = 6;
    private static final int BASE_STRENGTH = 7;

    @Override
    public void action(int choice) {
//TODO choice is static at the moment
        choice = 1;
        switch (choice) {
            case 1:
                talk("raget, raget ");
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
        return "Giant frog";
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_GREEN, "F");
    }


}
