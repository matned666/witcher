package mat.ned.mechanics.specialAttacks;

import mat.ned.mechanics.species.Species;

public abstract class SpecialAttacks<E> {

    protected int manaCost;
    protected Species caster;
    protected Species target;

    public abstract void cast(Species species);
    public abstract void castEffects(Species caster);
    public abstract int getCastCost();
    public abstract String toString();
    public abstract String toVoice();


}
