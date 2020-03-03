package mat.ned.mechanics.magic;

import mat.ned.mechanics.species.Species;

public class Magic_MonsterWeakening extends Magic {

    private static final int WEAKEN_EFFECT_ON_TARGET_SPECIES = 10;
    private static final int MANA_COST = 5;

    public Magic_MonsterWeakening() {
        manaCost = MANA_COST;
    }

    @Override
    public void cast(Species species) {
        this.target = species;
        species.weaken(WEAKEN_EFFECT_ON_TARGET_SPECIES);
    }

    @Override
    public void castEffects(Species caster) {
        this.caster = caster;
    }

    @Override
    public int getCastCost() {
        return manaCost;
    }

    @Override
    public String toString() {
        return toVoice()+"\n"+this.caster.typeOfSpecies()+" casted Monster Weakening on "+this.target.typeOfSpecies()+", weakening him by "+WEAKEN_EFFECT_ON_TARGET_SPECIES+" pts.\n" +
                "That spell didn't have any additional effect on "+this.caster.typeOfSpecies();
    }

    @Override
    public String toVoice() {
        return "PUFFFF";
    }
}
