package mat.ned.mechanics;

import mat.ned.mechanics.magic.Magic;
import mat.ned.mechanics.magic.Magic_GlueSlap;
import mat.ned.mechanics.magic.Magic_MonsterWeakening;
import mat.ned.mechanics.monsters.GiantFrog;
import mat.ned.mechanics.monsters.Monster;
import mat.ned.mechanics.witcher.Witcher;
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
        geralt.attack(giantFrog, 15);
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
        geralt.attack(giantFrog,20);
        assertEquals(giantFrog.getHitPoints(), 15);
    }

    @Test
    void witcherCannotCastAnySpellWhenHasNoManaLeft(){
        geralt.magicCast(weakening, giantFrog);
        geralt.magicCast(weakening, giantFrog);
        geralt.magicCast(weakening, giantFrog);
        geralt.magicCast(weakening, giantFrog);

        giantFrog.attack(geralt, 50);

        assertEquals(geralt.getHitPoints(), 20);

    }

    @Test
    void frogCannotCastAnySpellWhenHasNoManaLeft(){
        giantFrog.magicCast(glueSlap, geralt);
        giantFrog.magicCast(glueSlap, geralt);
        giantFrog.magicCast(glueSlap, geralt);
        giantFrog.magicCast(glueSlap, geralt);

        geralt.attack(giantFrog, 30);

        assertEquals(giantFrog.getHitPoints(), 10);

    }

    @Test
    void speciesSpellCastingRemovesMana(){
        giantFrog.magicCast(glueSlap, geralt);
        geralt.magicCast(weakening, giantFrog);

        assertEquals(giantFrog.getMana(), 3);
        assertEquals(geralt.getMana(), 5);

    }


    @Test void checkIfSpeciesAreWeakenedAfterGlueSlapSpellEffects(){
        giantFrog.magicCast(glueSlap,geralt);
        geralt.magicCast(glueSlap,giantFrog);
        giantFrog.attack(geralt,50);
        geralt.attack(giantFrog,30);
        assertEquals(geralt.getHitPoints(), 8);
        assertEquals(giantFrog.getHitPoints(), 8);
        assertEquals(geralt.getMana(), 7);
        assertEquals(giantFrog.getMana(), 3);
    }

}