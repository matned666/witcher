package mat.ned.mechanics;

import mat.ned.mechanics.maps.placesMaps.Direction;
import mat.ned.mechanics.maps.placesMaps.ParametrizedMap;
import mat.ned.mechanics.maps.placesMaps.Place;
import mat.ned.mechanics.maps.placesMaps.fields.MapField;
import mat.ned.mechanics.monsters.GiantFrog;
import mat.ned.mechanics.monsters.Monster;
import mat.ned.mechanics.witcher.Witcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class SpeciesTest {

    private Monster giantFrog;
    private Witcher geralt;
    private Place testPlace;


    @BeforeEach
    void setUpEach() throws FileNotFoundException {
        giantFrog = new GiantFrog();
        geralt = new Witcher();
        testPlace = new ParametrizedMap("src/main/resources/test.map");
        geralt.setActualMap(testPlace);
        giantFrog.setActualMap(testPlace);
    }

    @Test
    void structuralTestGettingActualFieldClassName(){
        geralt.setActualField(7,1);
        MapField field = geralt.getActualPositionField();
        assertEquals(field.getClass().getSimpleName(), "Water");
    }

    @Test
    void checkIfGeraltCanWalk_AndPreviousFieldIsAccessibleAgain(){
        geralt.setActualField(17,1);
        geralt.move(Direction.RIGHT);

        assertTrue(testPlace.getMatrix()[17][1].isAccessible());
        assertFalse(testPlace.getMatrix()[17][2].isAccessible());
        assertEquals(geralt.getActualPositionField(), testPlace.getMatrix()[17][2]);
    }

    @Test
    void checkIfGeraltStopsWhenOnTheEndOfMap(){
        geralt.setActualField(17,2);
        geralt.move(Direction.LEFT);
        assertEquals(geralt.getActualPositionField(), testPlace.getMatrix()[17][1]);
        geralt.move(Direction.LEFT);
        assertEquals(geralt.getActualPositionField(), testPlace.getMatrix()[17][0]);
        geralt.move(Direction.LEFT);
        assertEquals(geralt.getActualPositionField(), testPlace.getMatrix()[17][0]);
    }

    @Test
    void  checkIfFrogCanMoveOnOtherSpeciesField(){
        geralt.setActualField(16,2);
        giantFrog.setActualField(16,3);
        giantFrog.move(Direction.LEFT);

        assertFalse(geralt.getActualPositionField().isAccessible());
        assertFalse(giantFrog.getActualPositionField().isAccessible());
        assertNotEquals(geralt.getActualPositionField(), giantFrog.getActualPositionField());
    }

    @Test
    void isItPossibleToGetDrawnInWater(){

        geralt.setActualField(7,0);

        geralt.move(Direction.RIGHT);
        geralt.move(Direction.RIGHT);
        geralt.move(Direction.LEFT);
        geralt.move(Direction.LEFT);

        assertEquals(geralt.getWeaknessLevel(), 4);
    }

    @Test
    void isItPossibleToMoveUpAndDown_IsItGoingOutBounds(){
        geralt.setActualField(16,13);
        geralt.move(Direction.UP);
        assertEquals(geralt.actualField, testPlace.getMatrix()[15][13]);
        geralt.move(Direction.DOWN);
        assertEquals(geralt.actualField, testPlace.getMatrix()[16][13]);
        for (int i = 0; i < 17; i++)  geralt.move(Direction.UP);
        assertEquals(geralt.actualField, testPlace.getMatrix()[12][13]);
        geralt.move(Direction.DOWN);
         assertEquals(geralt.actualField, testPlace.getMatrix()[13][13]);
        geralt.move(Direction.DOWN);
        assertEquals(geralt.actualField, testPlace.getMatrix()[14][13]);
        geralt.move(Direction.DOWN);
        assertEquals(geralt.actualField, testPlace.getMatrix()[15][13]);
        geralt.move(Direction.DOWN);
        assertEquals(geralt.actualField, testPlace.getMatrix()[16][13]);
        geralt.move(Direction.DOWN);
        assertEquals(geralt.actualField, testPlace.getMatrix()[17][13]);
        geralt.move(Direction.DOWN);
        assertEquals(geralt.actualField, testPlace.getMatrix()[17][13]);
        geralt.move(Direction.DOWN);
        assertEquals(geralt.actualField, testPlace.getMatrix()[17][13]);

    }

    @Test
    void canWitcherGoThroughWalls(){
        geralt.setActualField(5,1);
        geralt.move(Direction.DOWN);
        geralt.move(Direction.DOWN);
        geralt.move(Direction.DOWN);
        geralt.move(Direction.DOWN);
        geralt.move(Direction.LEFT);
        geralt.move(Direction.LEFT);
        geralt.move(Direction.UP);

        assertEquals(geralt.actualField, testPlace.getMatrix()[5][1]);

    }

    @Test
    void canFrogDrownInWater(){
        giantFrog.setActualField(7,0);
        giantFrog.move(Direction.RIGHT);
        giantFrog.move(Direction.RIGHT);
        giantFrog.move(Direction.LEFT);
        giantFrog.move(Direction.LEFT);
        assertEquals(giantFrog.getWeaknessLevel(),0);
    }

    @Test
    void canBeKilledDueDrowning_CanHpGoBelowZero(){
        geralt.setActualField(7,0);

        for (int i = 0; i < 100; i++) {
            geralt.move(Direction.RIGHT);
            geralt.move(Direction.LEFT);
        }
        assertEquals(geralt.getWeaknessLevel(),50);
        assertEquals(geralt.getHitPoints(),0);
    }

    @Test
    void canWitcherOpenDoors_WalkThroughIt_AndCloseIt(){
        geralt.setActualField(10,0);
        assertFalse(testPlace.getMatrix()[11][0].isOpen());
        geralt.action(Direction.DOWN);
        assertTrue(testPlace.getMatrix()[11][0].isOpen());
        geralt.move(Direction.DOWN);
        geralt.move(Direction.DOWN);
        assertEquals(geralt.actualField, testPlace.getMatrix()[12][0]);
        geralt.action(Direction.UP);
        assertFalse(testPlace.getMatrix()[11][0].isOpen());
        geralt.move(Direction.UP);

    }

    @Test
    void isWitcherMakingActionWhenPathIsBlocked(){
        Species geralt = new Witcher("Geralt");
        geralt.setActualMap(testPlace);
        giantFrog.setActualField(13,3);
        geralt.setActualField(13,2);
        geralt.move(Direction.RIGHT);
        assertEquals(geralt.actualField, testPlace.getMatrix()[13][2]);
        assertNotEquals(giantFrog.getHitPoints(), 30);

    }

    @Test
    void isGiantFrogSignedToFieldWhereItStands_AndIfItNullWhenItMoved(){

        giantFrog.setActualField(16,3);
        assertEquals(testPlace.getMatrix()[16][3].getSpeciesOnThis().typeOfSpecies(), "Giant frog");
        giantFrog.move(Direction.LEFT);
        assertNull(testPlace.getMatrix()[16][3].getSpeciesOnThis());

    }

}