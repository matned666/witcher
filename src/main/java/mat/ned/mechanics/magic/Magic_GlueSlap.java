package mat.ned.mechanics.magic;

import mat.ned.mechanics.Species;

public class Magic_GlueSlap extends Magic {

    private static final int WEAKEN_EFFECT_ON_CASTER = 3;
    private static final int WEAKEN_EFFECT_ON_TARGET_SPECIES = 5;
    private static final int MANA_COST = 3;

    public Magic_GlueSlap() {
        manaCost = MANA_COST;
    }

    @Override
    public void cast(Species species) {
        super.target = species.getClass().getSimpleName();
        species.weaken(WEAKEN_EFFECT_ON_TARGET_SPECIES);
    }

    @Override
    public void castEffects(Species caster) {
        super.caster = caster.getClass().getSimpleName();
        System.out.println(toString());
        caster.weaken(WEAKEN_EFFECT_ON_CASTER);
    }

    @Override
    public int getCastCost() {
        return manaCost;
    }

    @Override
    public String toString() {
        return toVoice()+"\n"+super.caster+" slapped a gluing maze on "+target+", weakening him with "+ WEAKEN_EFFECT_ON_TARGET_SPECIES + " pts.\n" +
                "Casting was slightly enfeeble, "+super.caster+" is weaken by "+WEAKEN_EFFECT_ON_CASTER+" pts.";
    }

    @Override
    public String toVoice() {
        return "SLAAPPPP";
    }
}
