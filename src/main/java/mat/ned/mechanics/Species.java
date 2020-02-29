package mat.ned.mechanics;

import mat.ned.mechanics.magic.Magic;

public interface Species {


    boolean isAlive();
    void wasHit(int hp);
    void attack(Species character, int i);
    int getHitPoints();
    int getMana();
    void weaken(int amount);
    void magicCast(Magic magic, Species species);
    String toString();

}
