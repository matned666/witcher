package mat.ned.mechanics.witcher;

import mat.ned.mechanics.Species;
import mat.ned.mechanics.magic.Magic;
import mat.ned.mechanics.magic.Magic_MonsterWeakening;
import mat.ned.mechanics.maps.placesMaps.Colored;

public class Witcher implements Species {

    private int hp;
    private int mana;
    private int weakenAmount;

    public Witcher() {
        this.hp = 50;
        this.mana = 10;
    }

    @Override
    public boolean isAlive() {
        return this.hp > 0;
    }

    @Override
    public void wasHit(int hp) {
        this.hp -= hp;
    }

    @Override
    public void attack(Species character, int hp) {
        character.wasHit(hp-weakenAmount);
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
    public String toString() {
        return "@";
    }


}
