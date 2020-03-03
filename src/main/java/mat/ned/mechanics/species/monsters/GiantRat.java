package mat.ned.mechanics.species.monsters;


import mat.ned.mechanics.maps.placesMaps.Colored;

public class GiantRat extends Monster {


    public GiantRat() {
        this.weakenAmount = 0;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    public GiantRat(String name) {
        this.weakenAmount = 0;
        this.name = name;
        this.hp = BASE_HP;
        this.mana = BASE_MANA;
        this.strength = BASE_STRENGTH;
    }

    private static final int BASE_HP = 10;
    private static final int BASE_MANA = 0;
    private static final int BASE_STRENGTH = 7;

    @Override
    public void action(int choice) {
//TODO choice is static at the moment
        choice = 1;
        switch (choice) {
            case 1:
                talk("piiiii, piiiiii");
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
        return "Giant rat";
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_GREEN, "r");
    }


}
