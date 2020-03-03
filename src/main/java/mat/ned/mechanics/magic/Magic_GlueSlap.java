package mat.ned.mechanics.magic;

import mat.ned.mechanics.species.Species;

public class Magic_GlueSlap extends Magic {

    private static final int WEAKEN_EFFECT_ON_CASTER = 3;
    private static final int WEAKEN_EFFECT_ON_TARGET_SPECIES = 8;
    private static final int MANA_COST = 3;

    public Magic_GlueSlap() {
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
        System.out.println(toString());
        caster.weaken(WEAKEN_EFFECT_ON_CASTER);
    }

    @Override
    public int getCastCost() {
        return manaCost;
    }

    @Override
    public String toString() {
        return toVoice()+"\n"+this.caster.typeOfSpecies()+" slapped a gluing maze on "+target.typeOfSpecies()+", weakening him with "+ WEAKEN_EFFECT_ON_TARGET_SPECIES + " pts.\n" +
                "Casting was slightly enfeeble, "+this.caster.typeOfSpecies()+" is weaken by "+WEAKEN_EFFECT_ON_CASTER+" pts.";
    }

    @Override
    public String toVoice() {
        return "SLAAPPPP";
    }
}
