package mat.ned.mechanics.specialAttacks;

import mat.ned.mechanics.species.Species;

public class VenomousBite extends SpecialAttacks {

    private static final int WEAKEN_EFFECT_ON_CASTER = 3;
    private static final int WEAKEN_EFFECT_ON_TARGET_SPECIES = 3;
    private static final int MANA_COST = 0;
    private final int HP = this.caster.getStrength()*4;

    private final int poisonLvl = 5;

    public VenomousBite() {
        manaCost = MANA_COST;
    }

    @Override
    public void cast(Species species) {
        this.target = species;
        species.weaken(WEAKEN_EFFECT_ON_TARGET_SPECIES);
        species.attack(target,HP);
        species.isPoisoned(5);
        //TODO

    }

    @Override
    public void castEffects(Species caster) {
        this.caster = caster;
        caster.weaken(WEAKEN_EFFECT_ON_CASTER);
    }

    @Override
    public int getCastCost() {
        return manaCost;
    }

    @Override
    public String toString() {
        return toVoice()+"\n"+this.caster+" attack "+target+", weakening him with "+ WEAKEN_EFFECT_ON_TARGET_SPECIES + " pts.\n" +
                "and hitin with "+HP+" hp pts. Casting was slightly enfeeble, "+this.caster+" is weaken by "+WEAKEN_EFFECT_ON_CASTER+" pts.";
    }

    @Override
    public String toVoice() {
        return "SSSSTT";
    }
}
