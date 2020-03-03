package mat.ned.mechanics;

import mat.ned.mechanics.magic.Magic;
import mat.ned.mechanics.magic.Magic_GlueSlap;
import mat.ned.mechanics.magic.Magic_MonsterWeakening;
import mat.ned.mechanics.species.monsters.GiantFrog;
import mat.ned.mechanics.species.monsters.Monster;
import mat.ned.mechanics.species.humans.Witcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//mvn org.pitest:pitest-maven:mutationCoverage

import static org.junit.jupiter.api.Assertions.*;

class WitcherFightingMonsterTest {
    private Monster giantFrog;
    private Witcher geralt;
    private Magic glueSlap;
    private Magic weakening;


    //TODO Mockito tests



    @BeforeEach
    void setUpEach(){
        giantFrog = new GiantFrog();
        geralt = new Witcher();
        glueSlap = new Magic_GlueSlap();
        weakening = new Magic_MonsterWeakening();
    }

    @Test
    void isMonsterKilledByWitcher(){
        geralt.attack(giantFrog, 10);
        assertTrue(giantFrog.isAlive());
        geralt.attack(giantFrog, 15);

        assertFalse(giantFrog.isAlive());

    }

    @Test
    void isWitcherKilledByMonster(){
        giantFrog.attack(geralt, 50);
        assertFalse(geralt.isAlive());
    }

    @Test
    void isFrogWeakenByAMagicCast(){
        Magic weakening = new Magic_MonsterWeakening();
        geralt.magicCast(weakening,giantFrog);
        giantFrog.attack(geralt,20);
        assertEquals(geralt.getHitPoints(), 40);

    }

    @Test
    void isWitcherWeakenByAGlueSlap(){
        Magic glueSlap = new Magic_GlueSlap();
        giantFrog.magicCast(glueSlap, geralt);
        geralt.attack(giantFrog,15);
        assertEquals(giantFrog.getHitPoints(), 13);
    }

    @Test
    void witcherCannotCastAnySpellWhenHasNoManaLeft(){
        geralt.magicCast(weakening, giantFrog);
        geralt.magicCast(weakening, giantFrog);
        geralt.magicCast(weakening, giantFrog);
        geralt.magicCast(weakening, giantFrog);
        geralt.magicCast(weakening, giantFrog);
        geralt.magicCast(weakening, giantFrog);
        geralt.magicCast(weakening, giantFrog);

        giantFrog.attack(geralt, 50);

        assertEquals(geralt.getHitPoints(), 40);

    }

    @Test
    void frogCannotCastAnySpellWhenHasNoManaLeft(){
        giantFrog.magicCast(glueSlap, geralt);
        giantFrog.magicCast(glueSlap, geralt);
        giantFrog.magicCast(glueSlap, geralt);
        giantFrog.magicCast(glueSlap, geralt);

        geralt.attack(giantFrog, 30);

        assertEquals(giantFrog.getHitPoints(), 6);

    }

    @Test
    void speciesSpellCastingRemovesMana(){
        giantFrog.magicCast(glueSlap, geralt);
        geralt.magicCast(weakening, giantFrog);

        assertEquals(giantFrog.getMana(), 3);
        assertEquals(geralt.getMana(), 15);

    }


    @Test void checkIfSpeciesAreWeakenedAfterGlueSlapSpellEffects(){
        giantFrog.magicCast(glueSlap,geralt);
        geralt.magicCast(glueSlap,giantFrog);
        giantFrog.attack(geralt,50);
        geralt.attack(giantFrog,20);
        assertEquals(geralt.getHitPoints(), 11);
        assertEquals(giantFrog.getHitPoints(), 11);
        assertEquals(geralt.getMana(), 17);
        assertEquals(giantFrog.getMana(), 3);
    }

}