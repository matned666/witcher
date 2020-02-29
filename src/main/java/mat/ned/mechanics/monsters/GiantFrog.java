package mat.ned.mechanics.monsters;

import mat.ned.mechanics.Species;
import mat.ned.mechanics.magic.Magic;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class GiantFrog implements Monster{

    private int hp;
    private int weakenAmount;
    private int mana;

    public GiantFrog() {
        this.weakenAmount = 0;
        this.hp = 30;
        this.mana = 6;
    }

    @Override
    public void attack(Species character, int hp) {
        character.wasHit(hp-weakenAmount);
    }

    @Override
    public void wasHit(int hp) {
        this.hp -= hp;
     }

    @Override
    public int getHitPoints() {
        return hp;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void weaken(int amount) {
        weakenAmount += amount;
    }

    @Override
    public void magicCast(Magic magic, Species species) {
        if(mana - magic.getCastCost() >= 0 ) {
            magic.cast(species);
            magic.castEffects(this);
            mana = mana - magic.getCastCost();
        }else{
            System.out.println("Impossible move.");
        }
    }

    @Override
    public boolean isAlive() {
        return this.hp > 0;
    }

    @Override
    public String toString() {
        return Colored.get(Colored.ANSI_GREEN, "F");
    }
}
