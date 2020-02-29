package mat.ned.mechanics.magic;

import mat.ned.mechanics.Species;

public class Magic_MonsterWeakening extends Magic {

    private static final int WEAKEN_EFFECT_ON_TARGET_SPECIES = 10;
    private static final int MANA_COST = 5;

    public Magic_MonsterWeakening() {
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
    }

    @Override
    public int getCastCost() {
        return manaCost;
    }

    @Override
    public String toString() {
        return toVoice()+"\n"+super.caster+" casted Monster Weakening on "+super.target+", weakening him by "+WEAKEN_EFFECT_ON_TARGET_SPECIES+" pts.\n" +
                "That spell didn't have any additional effect on "+super.caster;
    }

    @Override
    public String toVoice() {
        return "PUFFFF";
    }
}
